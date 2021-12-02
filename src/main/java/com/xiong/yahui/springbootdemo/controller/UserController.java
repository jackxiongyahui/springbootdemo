package com.xiong.yahui.springbootdemo.controller;

import com.xiong.yahui.springbootdemo.entity.User;
import com.xiong.yahui.springbootdemo.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: Xiong.yahui
 * @Eamil: 947176043@qq.com
 * @Date: 2021/8/2 19:30
 **/
@RestController
@RequestMapping(path = "/api",produces = "application/json;charset=utf-8")
@Api(tags = "User管理")
@Slf4j
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/list")
    @ApiOperation(value = "获取用户数据")
    public List<User> list(){
        return userService.selectAllUsers();
    }

    @GetMapping("/get/{id}")
    @ApiOperation(value = "根据id查询用户")
    public User getUserById(@PathVariable int id){
        return userService.selectByPrimaryKey(id);
    }

    @PostMapping("/insert")
    @ApiOperation(value = "增加一个用户")
    public Integer insertUser(@RequestBody User user){
        return userService.insertSelective(user);
    }

    @PostMapping("/update")
    @ApiOperation(value = "修改一个用户数据")
    public Integer updateUser(@RequestBody User user){
        log.info("User的值为：{}", user);
        return userService.updateByPrimaryKeySelective(user);
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation(value = "删除一条用户数据")
    public Integer deleteUser(@PathVariable int id){
        return userService.deleteByPrimaryKey(id);
    }


}
