package com.gohilumang.quiz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
@SpringBootApplication(scanBasePackages = "com.gohilumang.quiz")
public class ServletInitializer extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ServletInitializer.class);
    }
    
    public static void main(String[] args) {
        SpringApplication.run(ServletInitializer.class, args);
        System.out.println("Listening at port 8080.......");
    }
}