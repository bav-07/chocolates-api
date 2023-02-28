package com.bnta.chocolate.configurations;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class SpringGlobalConfig implements WebMvcConfigurer {

    public void addCorsMappings(CorsRegistry registry){
//        registry.addMapping("/chocolates")
//                .allowedOrigins("https://localhost:3000")
//                .allowedHeaders("*")
//                .allowedMethods("GET, PUT");
        registry.addMapping("/**")
                .allowedOrigins("*")
                .allowedHeaders("*")
                .allowedMethods("*");
    }

}
