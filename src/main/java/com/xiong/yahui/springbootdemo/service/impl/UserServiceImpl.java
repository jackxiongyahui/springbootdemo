package com.xiong.yahui.springbootdemo.service.impl;

import com.xiong.yahui.springbootdemo.entity.User;
import com.xiong.yahui.springbootdemo.mapper.UserMapper;
import com.xiong.yahui.springbootdemo.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Xiong.yahui
 * @Eamil: 947176043@qq.com
 * @Date: 2021/8/2 19:28
 **/
@Service
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;

    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(User record) {
        return userMapper.insert(record);
    }

    @Override
    public int insertSelective(User record) {
        return userMapper.insertSelective(record);
    }

    @Override
    public User selectByPrimaryKey(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<User> selectAllUsers() {
        return userMapper.selectAllUsers();
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        return userMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(User record) {
        return userMapper.updateByPrimaryKey(record);
    }
}
