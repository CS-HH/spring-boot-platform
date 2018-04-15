package com.iFox.hh.service.impl;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.iFox.hh.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 通用Service
 *
 * @author exphuhong
 * @since 12:17 2018/4/15
 */
@Service
public class BaseService<T> implements IService<T> {

    @Autowired
    private BaseMapper<T> baseMapper;

    @Override
    public T selectByKey(Object key) {
        int id = (int) key;
        return baseMapper.selectById(id);
    }

    @Override
    public int save(T entity) {
        return baseMapper.insert(entity);
    }

    @Override
    public int delete(Object key) {
        int id = (int) key;
        return baseMapper.deleteById(id);
    }

    @Override
    public int updateAll(T entity) {
        return baseMapper.updateAllColumnById(entity);
    }

    @Override
    public int updateNotNull(T entity) {
        return baseMapper.updateById(entity);
    }

    @Override
    public List<T> selectByExample(Object example) {
        return null;
    }
}
