package factory.abstractfactory;

import factory.CircleShape;
import factory.Shape;

public class RedCircleFactory implements AbstractFactory{
    @Override
    public Color getColor() {
        return new RedColor();
    }

    @Override
    public Shape getShape() {
        return new CircleShape();
    }
}
