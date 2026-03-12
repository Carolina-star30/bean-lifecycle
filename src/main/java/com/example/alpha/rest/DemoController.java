package com.example.alpha.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import util.Chef;


@RestController
public class DemoController {

    private Chef myChef;



    @Autowired
    public DemoController(
            @Qualifier("mexicanChef") Chef theChef)
    {
        System.out.printf("In constructir: " + getClass().getSimpleName());
        myChef = theChef;
    }


    // setter injection
//    @Autowired
//    public void setMyChef(Chef theChef) {
//        myChef = theChef;
//    }

    @GetMapping("/dailyrecipe")
    public String getDailyRecipe() {
        return myChef.getDailyRecipe();
    }
}
