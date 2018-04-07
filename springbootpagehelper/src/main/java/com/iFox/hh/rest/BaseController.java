package com.iFox.hh.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author exphuhong
 * @since 13:06 2018/4/7
 */
@Controller
public class BaseController {

    @RequestMapping("/")
    public String toIndex() {
        return "index";
    }
}
