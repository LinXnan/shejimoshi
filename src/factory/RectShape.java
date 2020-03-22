package factory;

/**
 * 正方形
 */
public class RectShape implements Shape {
    @Override
    public void draw() {
        System.out.println("正方形的绘画功能被调用了");
    }
}
