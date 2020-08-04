package com.js;

import com.js.util.StartLogo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Description Eurake注册中心
 * @Author jiangshuang
 */
@Slf4j
@EnableEurekaServer
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class OaEurakeStart {
    public static void main(String[] args) {
        try{
            SpringApplication.run(OaEurakeStart.class,args);
            log.info(StartLogo.print());
            log.info("项目启动成功");
        }catch (Exception e){
            log.info("项目启动失败");
        }

    }

}