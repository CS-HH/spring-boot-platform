package com.iFox.hh.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.iFox.hh.model.User;
import org.apache.ibatis.annotations.Param;

/**
 * 继承BaseMapper实现mybatis-plus
 *
 * @author exphuhong
 * @since 12:12 2018/4/15
 */
public interface UserMapper extends BaseMapper<User> {


    User selectByUserName(@Param("username")String username);
}