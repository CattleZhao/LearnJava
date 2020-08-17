package com.scorpion.designpattern.factory.factorymethod;

import com.scorpion.designpattern.factory.entity.Rectangle;
import com.scorpion.designpattern.factory.entity.Shape;

public class RectangleFactory implements ShapeFactory {
    @Override
    public Shape getShape() {
        return new Rectangle();
    }
}
