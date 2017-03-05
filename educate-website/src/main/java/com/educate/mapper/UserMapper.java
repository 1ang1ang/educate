package com.educate.mapper;

import com.educate.model.User;

import java.util.List;

/**
 * Created by sun on 2017/3/4.
 */
public interface UserMapper {
    int deleteByPrimaryKey(String uid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String uid);

    User selectByName(String name);

    List<User> selectAll();

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}