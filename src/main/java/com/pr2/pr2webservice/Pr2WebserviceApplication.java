package com.pr2.pr2webservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.pr2.pr2webservice.mapper")
@SpringBootApplication
public class Pr2WebserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Pr2WebserviceApplication.class, args);
    }

}
