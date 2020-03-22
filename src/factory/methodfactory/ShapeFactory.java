package factory.methodfactory;

import factory.Shape;

/**
 * 图形工厂，讲简单工厂中的方法给抽象出来
 */
public interface ShapeFactory {
    Shape getShape();
}
