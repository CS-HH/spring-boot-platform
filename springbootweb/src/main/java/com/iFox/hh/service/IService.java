package com.iFox.hh.service;

import java.util.List;

/**
 * 用户Service
 *
 * @author exphuhong
 * @since 12:12 2018/4/15
 */
public interface IService<T> {

    T selectByKey(Object key);

    int save(T entity);

    int delete(Object key);

    int updateAll(T entity);

    int updateNotNull(T entity);

    List<T> selectByExample(Object example);

    //TODO 其他...
}
