package com.waitylyou.mnative;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "com.waitylyou.mnative.mapper", sqlSessionTemplateRef = "sqlSessionTemplate")
@SpringBootApplication
public class MnativeApplication {

    public static void main(String[] args) {
        SpringApplication.run(MnativeApplication.class, args);
    }

}
