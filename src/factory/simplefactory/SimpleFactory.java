package factory.simplefactory;

import factory.CircleShape;
import factory.RectShape;
import factory.Shape;
import factory.TirangleShape;

/**
 * 简单工厂类
 * 定义一个工厂类，根据传入的参数不同返回不同的实例，被创建的实例具有共同的父类或接口
 * 特点：
 * 1、并不归类到23种设计模式中，只是一种编程规范而已
 * 2、这种方式不符合开闭原则，因为有业务要添加的时候，需要修改到工厂类
 */
public class SimpleFactory {
    public static Shape getShape(String shapeType){
        Shape shape = null;
        if(shapeType.equalsIgnoreCase("circle")){
            shape = new CircleShape();
        }else if(shapeType.equalsIgnoreCase("rect")){
            shape = new RectShape();
        }else if(shapeType.equalsIgnoreCase("tirangle")){
            shape = new TirangleShape();
        }
        return shape;
    }

    public static void main(String[] args) {
        Shape shape = null;
        // 获取圆对象
        shape = SimpleFactory.getShape("circle");
        shape.draw();
        // 获取正方形对象
        shape = SimpleFactory.getShape("rect");
        shape.draw();
        // 获取三角形对象
        shape = SimpleFactory.getShape("Tirangle");
        shape.draw();
    }
}
