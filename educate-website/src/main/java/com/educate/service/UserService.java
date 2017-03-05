package com.educate.service;

import com.educate.bo.UserRegisterData;
import com.educate.enums.IdentityType;
import com.educate.error.LogicException;
import com.educate.error.ResultCode;
import com.educate.mapper.UserMapper;
import com.educate.model.User;
import com.educate.util.AppCommon;
import com.educate.util.MD5Util;
import com.educate.util.RegexUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by sun on 2017/3/1.
 */

@Service
public class UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserService.class);
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

    public User register(UserRegisterData registerData) throws LogicException {
        boolean isEmail = false;
        boolean isPhone = false;

        User user = new User();
        String value = registerData.getValue();
        if(RegexUtil.emailCheck(value)) {
            if(checkEmailExist(value)) {
                logger.error("register email exist!");
                throw new LogicException(ResultCode.PARAMS_ERROR, "input email exists!~", value);
            }
            user.setEmail(value);
            isEmail = true;
        } else if(RegexUtil.phoneCheck(value)) {
            if(checkPhoneExist(value)) {
                logger.error("register phone exist!");
                throw new LogicException(ResultCode.PARAMS_ERROR, "input phone num exists!~", value);
            }
            user.setPhoneNum(value);
            isPhone = true;
        } else {
            logger.error("register input value wrong!");
            throw new LogicException(ResultCode.PARAMS_ERROR, "input value not phone and not email~", value);
        }

        // TODO: 2017/3/6 判断身份
        long now = System.currentTimeMillis();
        user.setUid(AppCommon.getGUID());
        user.setIdentity(IdentityType.STUDENT.getType());
        user.setPassword(MD5Util.str2MD5(registerData.getPassword()));
        user.setName(registerData.getName());
        user.setLastLoginTime(now);
        user.setRegisterTime(now);
        userMapper.insert(user);
        return user;
    }

    private boolean checkPhoneExist(String phone) {
        return userMapper.selectByPhone(phone) != null;
    }

    private boolean checkEmailExist(String email) {
        return userMapper.selectByEmail(email) != null;
    }
}
