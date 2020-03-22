package singleton;

/**
 * 线程安全
 * 懒汉模式 延迟加载
 * 使用静态内部类保证现场安全，更推荐这种做法
 *      Java中静态内部类可以访问其外部类的静态成员属性，
 *      同时，静态内部类只有当被调用的时候才开始首次被加载，
 *      利用了classloader的机制来保证初始化instance时只有一个线程，
 *      所以也是线程安全的，同时没有性能损耗(加synchronized同步锁)，这种实现更推荐
 */
public class Singleton2LanHanStaticClass {
    // 静态内部类
    private static class SingletonBulider{
        private static Singleton2LanHanStaticClass instance = new Singleton2LanHanStaticClass();
    }
    // 私有构造函数
    private Singleton2LanHanStaticClass(){}
    // 静态公有获取实例对象的方法
    public static Singleton2LanHanStaticClass getInstance(){
        return SingletonBulider.instance;
    }
    // 开启10个线程 测试
    public static void main(String[] args) {
        for (int i=0;i <10;i++){
            new Thread(()-> System.out.println(Singleton2LanHan.getInstance())).start();
        }
    }
}
