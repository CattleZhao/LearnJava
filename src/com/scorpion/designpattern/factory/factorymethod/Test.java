package com.scorpion.designpattern.factory.factorymethod;

public class Test {

    public static void main(String[] args) {
        ShapeFactory circleFactory = new SquareFactory();
        circleFactory.getShape().draw();
    }

}
