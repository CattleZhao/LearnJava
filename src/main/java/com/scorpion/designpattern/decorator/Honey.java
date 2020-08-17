package com.scorpion.designpattern.decorator;

public class Honey extends CondimentDecorator{
    Beverage beverage;

    public Honey(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return "honey " + beverage.getDescription();
    }

    @Override
    public double cost() {
        return 1.0 + beverage.cost();
    }
}
