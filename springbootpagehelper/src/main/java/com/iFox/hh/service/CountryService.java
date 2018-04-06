package com.iFox.hh.service;

import com.github.pagehelper.PageHelper;
import com.iFox.hh.mapper.CountryMapper;
import com.iFox.hh.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 *@author exphuhong
 *@since  19:26 2018/4/6
 *
 */
@Service
public class CountryService {

    @Autowired
    private CountryMapper countryMapper;

    public List<Country> getAll(Country country) {
        if (country.getPage() != null && country.getRows() != null) {
            PageHelper.startPage(country.getPage(), country.getRows());
        }
        return countryMapper.selectAll();
    }
}
