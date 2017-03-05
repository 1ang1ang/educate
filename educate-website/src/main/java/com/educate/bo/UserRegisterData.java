package com.educate.bo;

import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;

/**
 * Created by sun on 2017/3/5.
 */
@ApiModel(value = "玩家注册请求参数")
public class UserRegisterData {
    @NotNull
    @ApiModelProperty(value = "玩家注册邮箱或者手机号")
    private String value;
    @NotNull
    @ApiModelProperty(value = "密码")
    private String password;
    @ApiModelProperty(value = "昵称")
    private String name;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
