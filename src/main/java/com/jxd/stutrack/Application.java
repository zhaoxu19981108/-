package com.jxd.stutrack;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Daniel
 * @version 3.0
 * @description
 * @date 2020/10/26 10:53
 */
@SpringBootApplication
@MapperScan("com.jxd.stutrack.mapper")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
