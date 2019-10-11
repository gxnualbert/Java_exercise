package design.pattern.principle.inversion.improve;

/**
 * @auther gxnualbert
 * @create 2019-10-09-16:31
 */
public class DependencyInversion {

    public static void main(String[] args) {
        //客户端无需改变
        Person person = new Person();
        person.receive(new Email());

        person.receive(new WeiXin());

        person.receive(new QQ());
    }
}
    //定义接口
    interface IReceiver {
        public String getInfo();
    }

    class Email implements IReceiver {
        public String getInfo() {
            return "电子邮件信息: hello,world";
        }
    }

    //增加微信
    class WeiXin implements IReceiver {
        public String getInfo() {
            return "微信信息: hello,ok";
        }
    }

    //增加QQ
    class QQ implements  IReceiver{
        @Override
        public String getInfo() {
            return "这是来自QQ的消息";
        }
    }
    //方式2
    class Person {
        //这里我们是对接口的依赖
        public void receive(IReceiver receiver ) {
            System.out.println(receiver.getInfo());
        }
    }


