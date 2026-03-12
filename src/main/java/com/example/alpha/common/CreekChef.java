package com.example.alpha.common;

public class CreekChef implements Chef {

    public GreekChef () {
        System.out.println("In constructor " + getClass().getSimpleName());
    }

    @Override
    public String getDailyRecipe()
    {
        return "Greek  Chef prepare a salad";
    }

}
