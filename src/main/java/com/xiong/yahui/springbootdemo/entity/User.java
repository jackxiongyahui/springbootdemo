package com.xiong.yahui.springbootdemo.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.Data;

/**
 * user
 * @author 
 */
@ApiModel(value="com.xiong.yahui.springbootdemo.entity.User用户表")
@Data
public class User implements Serializable {
    /**
     * 自增id
     */
    @ApiModelProperty(value="自增id")
    private Integer id;

    /**
     * 用户名
     */
    @ApiModelProperty(value="用户名")
    private String username;

    /**
     * 密码
     */
    @ApiModelProperty(value="密码")
    private String password;

    private static final long serialVersionUID = 1L;
}