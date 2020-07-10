package com.example.bx_web.service.impl;

import com.example.bx_web.mapper.UserMapper;
import com.example.bx_web.pojo.User;
import com.example.bx_web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public User userLogin(User user) {
        return this.userMapper.userLogin(user);
    }


    @Override
    public void userRegister(User user) {
        this.userMapper.userRegister(user);
    }

    @Override
    public User userinfo(int user_id) {
        return this.userMapper.userinfo(user_id);
    }

    @Override
    public void modifyinfo(User user) {
        this.userMapper.modifyinfo(user);
    }

    @Override
    public void rechargeMember(int user_id) {
         this.userMapper.rechargeMember(user_id);
    }
}
