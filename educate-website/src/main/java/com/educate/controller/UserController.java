package com.educate.controller;

import com.educate.bo.UserRegisterData;
import com.educate.error.LogicException;
import com.educate.model.User;
import com.educate.service.UserService;
import com.wordnik.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by sun on 2017/3/1.
 */
@RestController
@RequestMapping(value="/users")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     *
     * @return
     */
    @ApiOperation(value="Get all users",notes="requires noting")
    @RequestMapping(method=RequestMethod.GET)
    public List<User> getUsers(){
        return userService.getAllUser();
    }

    @ApiOperation(value="Get user with id",notes="requires the id of user")
    @RequestMapping(value="id/{id}",method=RequestMethod.GET)
    public User getUserById(@PathVariable String id){
        return userService.getByUid(id);
    }

    @ApiOperation(value="Get user with name",notes="requires the name of user")
    @RequestMapping(value="name/{name}",method=RequestMethod.GET)
    public User getUserByName(@PathVariable String name){
        return userService.getByName(name);
    }

    @ApiOperation(value = "user register", notes = "send user info to register")
    @RequestMapping(value = "register", method = RequestMethod.PUT)
    public User register(@Validated @RequestBody UserRegisterData registerData) throws LogicException {
//        int a = 1 / 0;
        return userService.register(registerData);
    }
}
