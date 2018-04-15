package com.iFox.hh.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.iFox.hh.mapper.UserMapper;
import com.iFox.hh.model.User;
import com.iFox.hh.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class UserServiceImpl extends BaseService<User> implements UserService {

    @Resource
    private UserMapper userMapper;



    public List<User> selectByExample(String userName) {
        return userMapper.selectList(
                new EntityWrapper<>().eq("")
        );
    }
}
