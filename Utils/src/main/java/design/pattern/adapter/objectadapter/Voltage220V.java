package design.pattern.adapter.objectadapter;

/**
 * @auther gxnualbert
 * @create 2019-10-14-11:14
 */
public class Voltage220V {
    //输出220V的电压，不变
    public int output220V() {
        int src = 220;
        System.out.println("电压=" + src + "伏");
        return src;
    }

}
