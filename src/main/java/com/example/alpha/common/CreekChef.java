package com.example.alpha.common;

public class CreekChef {

    public GreekCHef () {
        System.out.println("In constructor " + getClass().getSimpleName());
    }

    @Override
    public String getDailyRecipe()
    {
        return "Greek  Chef prepare a salad";
    }

}
