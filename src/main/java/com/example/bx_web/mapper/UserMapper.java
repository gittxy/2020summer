package com.example.bx_web.mapper;

import com.example.bx_web.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {
    User userLogin(User user);
    void userRegister(User user);
    User userinfo(int user_id);
    void modifyinfo(User user);
    void rechargeMember(int user_id);
    int add(User user);
    int delete(int user_id);
    List<User> getAllUser();
}
