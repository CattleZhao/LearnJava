package com.scorpion.designpattern.decorator;

public abstract class CondimentDecorator extends Beverage{
    public CondimentDecorator(){
        description = "调味品";
    }

    public abstract String getDescription();

    @Override
    public abstract double cost();
}
