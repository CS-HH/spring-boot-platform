package com.iFox.hh.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 登陆控制器
 *
 * @author exphuhong
 * @since 19:02 2018/4/13
 */
@Controller
@RequestMapping("/web")
public class LoginController {

    @RequestMapping("login")
    public String login() {

        return null;
    }
}
