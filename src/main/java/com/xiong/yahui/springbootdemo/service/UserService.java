package com.xiong.yahui.springbootdemo.service;

import com.xiong.yahui.springbootdemo.entity.User;

import java.util.List;

/**
 * @Author: Xiong.yahui
 * @Eamil: 947176043@qq.com
 * @Date: 2021/8/2 19:26
 **/

public interface UserService {

    /**
     * 删除一条数据
     *
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 增加一条数据
     *
     * @param record
     * @return
     */
    int insert(User record);

    /**
     * 增加一条过滤数据
     *
     * @param record
     * @return
     */
    int insertSelective(User record);

    /**
     * 根据id查询
     *
     * @param id
     * @return
     */
    User selectByPrimaryKey(Integer id);

    /**
     * 查询所有用户
     *
     * @return
     */
    List<User> selectAllUsers();

    /**
     * 更新数据
     *
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * 根据id更新数据
     *
     * @param record
     * @return
     */
    int updateByPrimaryKey(User record);
}
