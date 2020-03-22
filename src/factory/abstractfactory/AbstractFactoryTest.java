package factory.abstractfactory;

/**
 * 抽象工厂
 * 1、只是方法工厂的升级版，但只有一种产品的时候，就是方法工厂，多种产品，就升级为抽象工厂
 * 此例子中加入了一种新的产品，color，所以组合起来就有很多组合了，这里只是列举了一种产品组合
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = new RedCircleFactory();
        abstractFactory.getColor().setColor();
        abstractFactory.getShape().draw();
    }
}
