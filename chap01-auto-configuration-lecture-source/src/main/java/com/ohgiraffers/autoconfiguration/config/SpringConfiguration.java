package com.ohgiraffers.autoconfiguration.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.sql.Array;
import java.util.Arrays;

@Configuration
//@ComponentScan("com.ohgiraffers.autoconfiguration")  //필기 읽는 경로를 지정해두면 파일관리에 편하다
public class SpringConfiguration {

    @Value("${test.value}")
    private String value;

    @Value("${test.list}")
    private String[] list;

    @Value(("${test.greeting}"))
    private String greeting;

    @Value("${test.array}")
    private String[] array;

    @Value("${username}")
    private String username;

    @Bean
    public Object propertyReadTest(){

//        System.out.println("value = " + value);

//        System.out.println("list = " + list);
//        Arrays.stream(list).forEach(System.out::println);

//        System.out.println("greeting = " + greeting);
//        System.out.println("array = " + array);

        System.out.println("username = " + username);
        return new Object();
    }
}
