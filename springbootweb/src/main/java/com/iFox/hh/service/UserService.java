package com.iFox.hh.service;

import com.iFox.hh.model.User;

/**
 * @author exphuhong
 * @since 12:34 2018/4/15
 */
public interface UserService {

    User selectByUserName(String username);
}
