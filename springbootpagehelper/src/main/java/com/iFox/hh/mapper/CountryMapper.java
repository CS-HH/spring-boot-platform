package com.iFox.hh.mapper;

import com.iFox.utility.mapper.MyMapper;
import com.iFox.hh.model.Country;

import java.util.List;

public interface CountryMapper extends MyMapper<Country> {

    List<Country> selectByKeyWords(String keyWords);
}