package com.educate.mapper;

import com.educate.model.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by sun on 2017/3/1.
 */
public interface UserMapper {
    public User findUserInfo(@Param("name")String name);
    public List<User> selectAll();
}
