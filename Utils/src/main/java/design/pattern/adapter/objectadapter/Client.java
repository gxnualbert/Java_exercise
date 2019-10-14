package design.pattern.adapter.objectadapter;

/**
 * @auther gxnualbert
 * @create 2019-10-14-11:17
 */
public class Client {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(" === 对象适配器模式 ====");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter(new Voltage220V()));
    }
}
