package com.example.alpha.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;
import util.Chef;

@Component
public class MexicanChef implements Chef {

    public MexicanChef () {
        System.out.println("In constructor " + getClass().getSimpleName());
    }

    @Override
    public String getDailyRecipe() {
        return "Mexican Chef prepare un tacos";
    }



//    @PostConstruct
//    public void initialLizeBean() {
//        System.out.println("Bean initialized " + getClass().getSimpleName());
//    }

//    @PreDestroy
//    public void cleanup() {
//        System.out.println("Bean is about to be destroyed " + getClass().getSimpleName());
//    }

}
