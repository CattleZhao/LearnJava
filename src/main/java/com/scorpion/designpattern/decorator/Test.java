package com.scorpion.designpattern.decorator;

public class Test {

    public static void main(String[] args) {
        Beverage beverage1 = new Coffee();
        beverage1 = new Sugar(beverage1);
        beverage1 = new Mocha(beverage1);
        System.out.println(beverage1.getDescription());
        System.out.println(beverage1.cost());
    }

}
