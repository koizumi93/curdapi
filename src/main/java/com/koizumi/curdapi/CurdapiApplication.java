package com.koizumi.curdapi;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.koizumi.curdapi.entity.Name;
import com.koizumi.curdapi.mapper.NameMapper;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class CurdapiApplication {
    
    public static void main(String[] args) throws Exception {
        SpringApplication.run(CurdapiApplication.class, args);
    }
}
