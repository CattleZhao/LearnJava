package com.scorpion.designpattern.decorator;

public class Coffee extends Beverage{

    public Coffee(){
        description = "Coffee";
    }

    @Override
    public double cost() {
        return 4.0;
    }
}
