package design.pattern.singleton.type6;

/**
 * @auther gxnualbert
 * @create 2019-10-11-8:42
 */
public class SingletonTest06 {
    public static void main(String[] args) {
        System.out.println("双重检查");
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2); // true
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }

}


// 懒汉式(线程安全，同步方法)---推荐使用
//关键字volatile
// volatile保证变量可见性的原理 参考https://www.cnblogs.com/kubidemanong/p/9505944.html#top
class Singleton {
    private static volatile Singleton instance;
    private Singleton() {}

    //提供一个静态的公有方法，加入双重检查代码，解决线程安全问题, 同时解决懒加载问题
    //同时保证了效率, 推荐使用

    public static synchronized Singleton getInstance() {
        if(instance == null) {
            synchronized (Singleton.class) {
                if(instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}