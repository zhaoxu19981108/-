package com.jxd.stutrack;/**
 * @创建人 Song pengfei
 * @创建时间 2020/10/29
 * @描述
 */

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName Application
 * @Description: TODO
 * @Author spf19
 * @Date 2020/10/29 
 * @Version V1.0
 **/
@SpringBootApplication
@MapperScan("com.jxd.stutrack.mapper")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}

