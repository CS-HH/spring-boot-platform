package com.iFox.hh;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * web启动类
 *@author exphuhong
 *@since  14:58 2018/4/15
 *
 */
@SpringBootApplication
@EnableTransactionManagement
@MapperScan(basePackages = "com.iFox.hh.mapper")
public class SpringApplication {
    private static Logger logger = LoggerFactory.getLogger(SpringApplication.class);

    public static void main(String[] args) {
        logger.info("程序启动中");
        org.springframework.boot.SpringApplication.run(SpringApplication.class);
    }
}
