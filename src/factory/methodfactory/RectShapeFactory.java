package factory.methodfactory;

import factory.RectShape;
import factory.Shape;

/**
 * 获取正方形对象的工厂
 */
public class RectShapeFactory implements ShapeFactory{
    @Override
    public Shape getShape() {
        return new RectShape();
    }
}
