package com.vibes.todolist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableCaching
//@MapperScan("com.vibes.todolist.mybatis.plus.generator.mapper,com.vibes.todolist.module.**.dao")
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

}
