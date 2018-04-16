package com.iFox.hh.realm;

import com.iFox.hh.model.User;
import com.iFox.hh.service.UserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * shiro Realm继承AuthorizingRealm
 *
 * @author exphuhong
 * @since 15:41 2018/4/14
 */
public class MyShiroRealm extends AuthorizingRealm {

    @Autowired
    private UserService userService;

    private Logger logger = LoggerFactory.getLogger(MyShiroRealm.class);

    //授权
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    //认证
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        logger.info("MyShiroRealm.doGetAuthenticationInfo()");
        //获取用户输的账号
        String username = (String) authenticationToken.getPrincipal();
        logger.info("用户输入的账号：" + username);
        logger.info("用户输入的密码："+authenticationToken.getCredentials());
        User user = userService.selectByUserName(username);
        if (user==null) throw new UnknownAccountException();
        if (user.getEnable() == 0) {
            throw new LockedAccountException();
        }
        ByteSource salt = ByteSource.Util.bytes(username);
        SimpleHash sh = new SimpleHash("MD5", user.getPassword(), salt,1024);
        String realmName = this.getName();
        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(username, sh, salt, realmName);
        /**
         * shiro自带的会话管理器
         Session session = SecurityUtils.getSubject().getSession();
         session.setAttribute("userSession", user);
         session.setAttribute("userSessionId", user.getId());
         * */

        return info;
    }
}
