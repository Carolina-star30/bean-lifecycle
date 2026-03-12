package com.example.alpha.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import util.Chef;


@RestController
public class DemoController {

    private Chef myChef;
    private Chef secondChef;


    @GetMapping("/check")
    public String check () {
        return "Comparing beans: myChef == secondChef is " + (myChef == secondChef);
    }

    @Autowired
    public DemoController(
            @Qualifier("frenchChef") Chef theChef,
            @Qualifier("frenchChef") Chef theSecondChef)
    {
        System.out.printf("In constructir: " + getClass().getSimpleName());
        myChef = theChef;
        secondChef = theSecondChef;
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
