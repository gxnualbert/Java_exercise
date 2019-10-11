package IntegerDemo;

/**
 * @auther gxnualbert
 * @create 2019-09-29-10:19
 */
public class IntegerToHex {


    public static void main(String[] args) {
//        byte TranNum=1;
//        System.out.println(Integer.toHexString(2));
////        byteVar & 0x000000FF的作用是，如果byteVar 是负数，则会清除前面24个零，
////        正的byte整型不受影响。(...) | 0xFFFFFF00的作用是，如果byteVar 是正数，则置前24位为一，
////        这样toHexString输出一个小于等于15的byte整型的十六进制时，倒数第二位为零且不会被丢弃，
////        这样可以通过substring方法进行截取最后两位即可。'
        System.out.println("mybyte1");
        byte mybyte1=50;
        // System.out.println((mybyte1 & 255)|256);
        System.out.println((mybyte1 & 0xFF)|0x100);
        System.out.println("mybyte2");
        byte mybyte2=-50;
        System.out.println((mybyte2 & 0xFF)|0x100);



//        byte[] b = {5,2,20,108};
//
//        for (int i = 0; i < b.length; i++) {
//            System.out.print(Integer.toHexString(b[i])+",");
//        }
//        // https://github.com/objcoding/WXPay-SDK-Java/blob/master/src/main/java/com/objcoding/wxpay/sdk/WXPayUtil.java
//        System.out.println("");
//        //做与运算
//        for (int i = 0; i < b.length; i++) {
//            System.out.print(Integer.toHexString(b[i] & 0xFF )+",");
//        }
    }

//    a.toHexString((item & 0xFF) | 0x100).substring(1, 3);
}
