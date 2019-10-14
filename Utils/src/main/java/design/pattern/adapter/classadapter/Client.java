package design.pattern.adapter.classadapter;

/**
 * @auther gxnualbert
 * @create 2019-10-14-10:47
 */
public class Client {
    public static void main(String[] args) {

        System.out.println(" === 类适配器模式 ====");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());
    }
}
