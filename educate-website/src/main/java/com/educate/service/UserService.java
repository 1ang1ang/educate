package com.educate.service;

import com.educate.mapper.UserMapper;
import com.educate.model.User;
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

    public User getUserInfo(String name){
        User user=userMapper.findUserInfo(name);
        //User user=null;
        return user;
    }

    public List<User> getAllUser() {
        return userMapper.selectAll();
    }
}
