package com.example.demo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.example.demo.util.ViewNames;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
@ComponentScan
public class WebConfig implements WebMvcConfigurer {
	
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
       
   
    	registry.addViewController("/").setViewName(ViewNames.HOME); //Controller for home directory
    }

}