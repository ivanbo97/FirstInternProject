package com.example.demo.util.thymeleaf;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class DecoupledLogicSetup {

   
    private final SpringResourceTemplateResolver templateResolver;


    @Autowired
    public DecoupledLogicSetup(SpringResourceTemplateResolver templateResolver) {
        this.templateResolver = templateResolver;
    }//end of constructor

   
    
    @PostConstruct
    public void init() {
        this.templateResolver.setUseDecoupledLogic(true);
        log.info("Decoupled template logic enabled");
    }
}