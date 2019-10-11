package design.pattern.factory.simplefactory.pizzastore.order;

/**
 * @auther gxnualbert
 * @create 2019-10-10-16:32
 */
public class PizzaStore{

    public static void main(String[] args) {
        //new OrderPizza();

        //使用简单工厂模式
        //new OrderPizza(new SimpleFactory());
        //System.out.println("~~退出程序~~");

        new OrderPizza2();
    }

}
