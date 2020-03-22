package singleton;


/**
 * 饿汉式：第一次引用类时，才进行对象实例化
 * 特点：
 * 1、在静态公有方法中做下判断，不为null的时候，才需要创建对象实例
 * 2、需要考虑多线程安全问题
 * 实现线程安全推荐的两种方法
 * 1、double check locking 双重检查锁定
 *      此种方法的做法是使用volatile 保证可见性
 *      另外在new 那里加上同步锁 使用关键字 synchronized
 * 2、静态内部类
 *      Java中静态内部类可以访问其外部类的静态成员属性，
 *      同时，静态内部类只有当被调用的时候才开始首次被加载，
 *      利用了classloader的机制来保证初始化instance时只有一个线程，
 *      所以也是线程安全的，同时没有性能损耗(加synchronized同步锁)，这种实现更推荐
 */
public class Singleton2LanHan {
    // 设置静态变量，懒汉模式无需初始化
    private static volatile Singleton2LanHan instance = null;
    // 设置私有构造函数
    private Singleton2LanHan(){
    }
    // 设置公有获取实例对象的方法 双重检验
    public static Singleton2LanHan getInstance(){
        if(instance == null){
            try {
                // 这里主要是为了模拟多线程中的数据准备导致延迟，引发线程不安全
                Thread.sleep(300);
                synchronized (Singleton2LanHan.class) {
                    if(instance == null) {
                        instance = new Singleton2LanHan();
                    }
                }

            }catch (Exception e){
                e.printStackTrace();
            }

        }
        return instance;
    }
    public static void main(String[] args) {
        for (int i=0;i <10;i++){
              new Thread(()-> System.out.println(Singleton2LanHan.getInstance())).start();
        }
    }
}
