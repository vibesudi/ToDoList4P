package com.vibes.todolist.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 拦截器注册
 * 
 * @author Administrator
 *
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {

//    /**
//     * 拦截器注册
//     */
//    @Resource
//    private TokenInterceptor tokenInterceptor;
//
//    @Override
//    public void addInterceptors(final InterceptorRegistry registry) {
//        registry.addInterceptor().addPathPatterns("/**")
//                // 拦截器直接放行
//                // 登录
//                .excludePathPatterns("/login")
//                // swagger
//                .excludePathPatterns("/", "/csrf", "/swagger-ui.html", "/swagger-resources/**", "/v2/api-docs",
//                        "/webjars/springfox-swagger-ui/**", "/www/**");
//    }
}
