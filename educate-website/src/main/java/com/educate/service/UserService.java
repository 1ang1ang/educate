package com.educate.service;

import com.educate.common.JsonResult;
import com.educate.common.ResultCode;
import com.educate.mapper.UserMapper;
import com.educate.model.User;
import com.educate.util.RegexUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by sun on 2017/3/1.
 */

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User getByUid(String uid){
        User user=userMapper.selectByPrimaryKey(uid);
        //User user=null;
        return user;
    }

    public User getByName(String name){
        User user=userMapper.selectByName(name);
        //User user=null;
        return user;
    }

    public List<User> getAllUser() {
        return userMapper.selectAll();
    }

    public User register(String value, String password) {
        boolean isEmail = false;
        boolean isPhone = false;

        if(RegexUtil.emailCheck(value)) {
            isEmail = true;
        } else if(RegexUtil.phoneCheck(value)) {
            isPhone = true;
        } else {
            return new JsonResult(ResultCode.PARAMS_ERROR, "user not exist!");
        }

        if(isEmail)
return null;
    }
}
