package com.educate.controller;

import com.educate.model.User;
import com.educate.service.UserService;
import com.wordnik.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
}
