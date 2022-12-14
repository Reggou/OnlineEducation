package com.wang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author wzzmm
 * @since 2022/10/24 22:29
 */
@MapperScan("com.wang.mapper")
@SpringBootApplication
@ComponentScan(basePackages = {"com.wang.servicebase"})
public class MybatisPlusDemoMain8080 {
    public static void main(String[] args) {
        SpringApplication.run(MybatisPlusDemoMain8080.class,args);
    }
}
