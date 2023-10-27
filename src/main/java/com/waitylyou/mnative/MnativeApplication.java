package com.waitylyou.mnative;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.nativex.MyBatisResourcesScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "com.waitylyou.mnative.mapper",sqlSessionTemplateRef = "sqlSessionTemplate")
@MyBatisResourcesScan(typeAliasesPackages = "com.waitylyou.mnative.entity",
        mapperLocationPatterns = "**mapper/**/*Mapper.xml")
@SpringBootApplication
public class MnativeApplication {

    public static void main(String[] args) {
        SpringApplication.run(MnativeApplication.class, args);
    }

}
