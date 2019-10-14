package design.pattern.adapter.classadapter;

/**
 * @auther gxnualbert
 * @create 2019-10-14-10:42
 */
//被适配的类
public class Voltage220V {
    //输出220V的电压
    public int output220V() {
        int src = 220;
        System.out.println("没有被适配之前，输入电压为：" + src + " 伏");
        return src;
    }
}
