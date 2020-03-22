package factory;

/**
 * 圆 circle
 * 实现 shape 接口
 */
public class CircleShape implements Shape {
    @Override
    public void draw() {
        System.out.println("圆的绘画功能被调用了");
    }
}
