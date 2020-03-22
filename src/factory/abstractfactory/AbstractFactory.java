package factory.abstractfactory;

import factory.Shape;

public interface AbstractFactory {
    Color getColor();
    Shape getShape();
}
