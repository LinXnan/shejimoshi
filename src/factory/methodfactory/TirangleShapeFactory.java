package factory.methodfactory;

import factory.Shape;
import factory.TirangleShape;

/**
 * 获取三角形对象的工厂
 */
public class TirangleShapeFactory implements ShapeFactory{
    @Override
    public Shape getShape() {
        return new TirangleShape();
    }
}
