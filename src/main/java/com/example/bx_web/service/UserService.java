package com.example.bx_web.service;

import com.example.bx_web.pojo.User;

public interface UserService {
    User userLogin(User user);
    void userRegister(User user);
    User userinfo(int user_id);
    void modifyinfo(User user);
    void rechargeMember(int user_id);
}
