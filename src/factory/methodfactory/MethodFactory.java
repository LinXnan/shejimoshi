package factory.methodfactory;

/**
 * 方法工厂模式
 * 特点：
 * 1、定义一个用于创建对象的接口，让子类决定将哪一个类实例化。工厂方法模式让一个类的实例化延迟到其子类
 * 2、简单工厂只提供统一的获取对象的工厂类，而方法工厂则是为每个对象都创建了工厂，然后对外只提供一个统一的工厂类，
 * 具体的创建则移步到子类工厂去创建了
 * 3、拓展比较方便，而且不影响其他业务
 * 4、方法工厂对应的是一种产品，如果对应多种的话，就上升为抽象工厂了
 * 5、抽象工厂模式是工厂方法模式的进一步抽象，针对的是一族产品。如果产品族中只有一种产品，则抽象工厂模式就退化为工厂方法模式
 */
public class MethodFactory {
    // 测试方法
    public static void main(String[] args) {
        ShapeFactory shapeFactory =null;
        //圆对象的工厂
        shapeFactory =new CircleShapeFactory();
        shapeFactory.getShape().draw();
        //正方形对象的工厂
        shapeFactory = new RectShapeFactory();
        shapeFactory.getShape().draw();
        //三角形对象的工厂
        shapeFactory = new TirangleShapeFactory();
        shapeFactory.getShape().draw();
    }
}
