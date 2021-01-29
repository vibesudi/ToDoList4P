package com.vibes.todolist.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;

@Configuration
@MapperScan("com.jijiankt.school.mybatis.plus.generator.mapper.*Dao")
public class MybatisPlusConfig {

    /**
     * paginationInterceptor：分页插件
     * 
     * @return
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }

}
