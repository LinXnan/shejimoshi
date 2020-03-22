package singleton;

/**
 * 单例模式的特点：
 *  1、构造函数是私有的，也即外部无法利用构造函数new 一个新的实例对象
 *  2、既然构造函数是单例的，那么必须提供一个静态公有方法获取单例对象
 * 单例模式：使用饿汉式实现
 * 饿汉式：类加载时，就进行对象实例化，即是用静态变量 static，并且进行初始化
 */
public class Singleton2EHan {
    // 私有静态实例
    private static Singleton2EHan instance = new Singleton2EHan();
    // 私有构造函数
    private Singleton2EHan(){
    }
    // 静态公有的方法用以获取单例对象
    public static Singleton2EHan getInstance(){
        return instance;
    }

    // 开启10个线程 测试
    public static void main(String[] args) {
        for (int i=0;i<10;i++){
            new Thread(()-> System.out.println(Singleton2EHan.getInstance())).start();
        }
    }
}
