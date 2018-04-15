package com.iFox.hh.rest;

import com.iFox.hh.model.User;
import com.iFox.utility.jwt.JWTHeader;
import com.iFox.utility.jwt.JWTPayload;
import com.iFox.utility.jwt.JWTUtils;
import com.iFox.utility.sysConstant.Constant;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import tk.mybatis.mapper.util.StringUtil;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.UUID;

/**
 * 登陆控制器
 *
 * @author exphuhong
 * @since 19:02 2018/4/13
 */
@Controller
public class HomeController {

    private static Logger logger = LoggerFactory.getLogger(HomeController.class);

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        logger.info("访问login");
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(HttpServletRequest request, User user) throws UnsupportedEncodingException {
        if (StringUtil.isEmpty(user.getUsername()) || StringUtil.isEmpty(user.getPassword())) {
            request.setAttribute("msg", "用户名和密码不能为空");
            return "login";
        }
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(user.getUsername(), user.getPassword());
        try {
            subject.login(token);

            //使用json web token 生成token返回给页面
            JWTHeader jwtHeader = new JWTHeader();
            JWTPayload jwtPayload = new JWTPayload();
            jwtPayload.setIss("exphuhong");
            jwtPayload.setIat(new Date());
            jwtPayload.setExp(new Date());
            jwtPayload.setNbf(new Date());
            jwtPayload.setJti(String.valueOf(UUID.randomUUID()));
            String jwt = JWTUtils.generateJWT(jwtHeader, jwtPayload, Constant.JWT_SECERT);


            return "redirect:usersPage";
        } catch (LockedAccountException lae) {
            token.clear();
            request.setAttribute("msg", "用户已经被锁定不能登录，请与管理员联系！");
            return "login";
        } catch (AuthenticationException e) {
            token.clear();
            request.setAttribute("msg", "用户或密码不正确！");
            return "login";
        }
    }

    @RequestMapping(value = {"/usersPage", ""})
    public String usersPage() {
        return "user/users";
    }

    @RequestMapping("/rolesPage")
    public String rolesPage() {
        return "role/roles";
    }

    @RequestMapping("/resourcesPage")
    public String resourcesPage() {
        return "resources/resources";
    }

    @RequestMapping("/403")
    public String forbidden() {
        return "403";
    }
}
