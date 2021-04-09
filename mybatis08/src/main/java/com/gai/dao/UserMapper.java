package com.gai.dao;

import com.gai.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    //根据id查询用户
    User queryUserById(@Param("id") int id);

    int updateUser(User user);
}
