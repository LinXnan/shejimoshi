package factory.methodfactory;

import factory.CircleShape;
import factory.Shape;

/**
 * 获取圆对象的工厂
 */
public class CircleShapeFactory implements ShapeFactory{
    @Override
    public Shape getShape() {
        return new CircleShape();
    }
}
