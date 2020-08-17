package com.scorpion.designpattern.factory.factorymethod;

import com.scorpion.designpattern.factory.entity.Shape;
import com.scorpion.designpattern.factory.entity.Square;

public class SquareFactory implements ShapeFactory {
    @Override
    public Shape getShape() {
        return new Square();
    }
}
