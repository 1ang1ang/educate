package com.educate.model;

import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

/**
 * Created by sun on 2017/3/1.
 */
@ApiModel(value = "用户表")
public class User {

    @ApiModelProperty(value = "用户UUID~唯一标识")
    private String uid;

    private String phonenum;

    private String email;

    private Integer lastlogintype;

    private String password;

    private Integer gender;

    private String name;

    private Integer age;

    @ApiModelProperty(value = "用户身份标识 0：游客 1：学生 2：教师 3：资料填充员 99：超级管理员")
    private Integer identity;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum == null ? null : phonenum.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getLastlogintype() {
        return lastlogintype;
    }

    public void setLastlogintype(Integer lastlogintype) {
        this.lastlogintype = lastlogintype;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getIdentity() {
        return identity;
    }

    public void setIdentity(Integer identity) {
        this.identity = identity;
    }
}