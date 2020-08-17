package com.scorpion.designpattern.factory.factorymethod;

import com.scorpion.designpattern.factory.entity.Circle;
import com.scorpion.designpattern.factory.entity.Shape;

public class CircleFactory implements ShapeFactory {

    @Override
    public Shape getShape() {
        return new Circle();
    }
}
