package design.pattern.adapter.classadapter;

/**
 * @auther gxnualbert
 * @create 2019-10-14-10:44
 */
public class VoltageAdapter extends Voltage220V implements IVoltage5V {
    @Override
    public int output5V() {
        //获取到220V电压
        int srcV = output220V();
        int dstV = srcV / 44 ; //转成 5v
        System.out.println("使用适配器，对电压进行适配-----");
        return dstV;
    }
}
