package design.pattern.adapter.interfaceadapter;

/**
 * @auther gxnualbert
 * @create 2019-10-14-11:41
 */
public class Client {
    public static void main(String[] args) {
        AbstractAdapter abstractAdapter=new AbstractAdapter() {
            @Override
            public void m1() {
                System.out.println("使用了m1的方法");
            }
        };
        abstractAdapter.m1();
    }
}
