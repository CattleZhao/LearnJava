package com.scorpion.designpattern.decorator;

import java.io.InputStream;

public class Sugar extends CondimentDecorator {
    Beverage beverage;

    public Sugar(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return "Sugar " + beverage.getDescription();
    }

    @Override
    public double cost() {
        return 1.0 + beverage.cost();
    }
}
