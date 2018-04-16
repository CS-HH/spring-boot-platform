package com.iFox.hh.service.impl;

import com.iFox.hh.mapper.UserMapper;
import com.iFox.hh.model.User;
import com.iFox.hh.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl extends BaseService<User> implements UserService {

    @Resource
    private UserMapper userMapper;




    @Override
    public User selectByUserName(String username) {
        return userMapper.selectByUserName(username);
    }
}
