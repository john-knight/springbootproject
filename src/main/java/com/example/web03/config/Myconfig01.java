package com.example.web03.config;

import com.example.web03.intercepeter;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class Myconfig01 extends WebMvcConfigurerAdapter {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
//        super.addViewControllers(registry);
    registry.addViewController("/dashbord").setViewName("dashbord");
        registry.addViewController("/index").setViewName("login");
//        registry.addRedirectViewController("zhuye", "/api/login");
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new intercepeter()).addPathPatterns("/**").excludePathPatterns("/index","/login");
    }
}
