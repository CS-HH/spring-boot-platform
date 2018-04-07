package com.iFox.hh.rest;

import com.github.pagehelper.PageInfo;
import com.iFox.hh.service.CountryService;
import com.iFox.hh.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author exphuhong
 * @since 19:30 2018/4/6
 */
@Controller
@RequestMapping("country")
public class CountryController extends BaseController {

    @Autowired
    private CountryService countryService;

    @RequestMapping("/getAll")
    public ModelAndView getAll(Country country) {
        List<Country> countryList = countryService.getAll(country);
        PageInfo<Country> pageInfo = new PageInfo<>(countryList);
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("page", pageInfo);
        return modelAndView;
    }
}
