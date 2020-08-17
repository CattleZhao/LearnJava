package com.scorpion.designpattern.decorator;


public class TeaMilk extends Beverage{
    public TeaMilk(){
        description = "TeaMilk";
    }

    @Override
    public double cost() {
        return 3.0;
    }
}
