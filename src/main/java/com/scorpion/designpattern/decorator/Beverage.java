package com.scorpion.designpattern.decorator;

public abstract class Beverage {
    protected String description;

    public Beverage(){
        description = "饮料";
    }

    public String getDescription() {
        return this.description;
    }

    public abstract double cost();
}
