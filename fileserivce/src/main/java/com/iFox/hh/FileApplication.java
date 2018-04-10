package com.iFox.hh;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 文件上传启动类
 *@author exphuhong
 *@since  16:05 2018/4/10
 *
 */
@SpringBootApplication
@ComponentScan("com.iFox.hh")
public class FileApplication {
    private static Logger logger = LoggerFactory.getLogger(FileApplication.class);

    public static void main(String[] args) {
        logger.info("文件系统启动中");
        SpringApplication.run(FileApplication.class);
    }
}
