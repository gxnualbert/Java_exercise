package design.pattern.prototype;

/**
 * @auther gxnualbert
 * @create 2019-10-11-10:15
 * 要求：现在又一只羊，姓名为tom，年龄为1，颜色为白色。
 * 请编写程序创建和Tom羊属性完全相同的10只羊
 *
 */
public class prototype {
    public static void main(String[] args) {
        //传统的方法
        Sheep sheep = new Sheep("tom", 1, "白色");

        Sheep sheep2 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep3 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep4 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep5 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        //....

        System.out.println(sheep);
        System.out.println(sheep2);
        System.out.println(sheep3);
        System.out.println(sheep4);
        System.out.println(sheep5);
        //...
    }
}
