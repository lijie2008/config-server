package com.wk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;


/**
 * ClassName ConfigServerApplication
 * Describe  配置中心服务
 *
 * @author lijie
 * @create 2018-01-17 10:35
 * 获取git上的资源信息遵循如下规则：
 *  /{application}/{profile}[/{label}]
    /{application}-{profile}.yml
    /{label}/{application}-{profile}.yml
    /{application}-{profile}.properties
    /{label}/{application}-{profile}.properties
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class);
    }
}
