package com.scorpion.designpattern.decorator;

public class Mocha extends CondimentDecorator{

    Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return "Mocha " + beverage.getDescription();
    }

    @Override
    public double cost() {
        return 2.0 + beverage.cost();
    }
}
