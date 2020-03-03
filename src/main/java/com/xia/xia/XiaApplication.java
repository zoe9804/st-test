package com.xia.xia;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xia.xia.mapper")
public class XiaApplication {

    public static void main(String[] args) {
        SpringApplication.run(XiaApplication.class, args);
    }

}
