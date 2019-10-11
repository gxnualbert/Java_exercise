package design.pattern.factory.simplefactory.pizzastore.pizza;

/**
 * @auther gxnualbert
 * @create 2019-10-10-16:36
 */
public class CheesePizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println(" 给制作奶酪披萨 准备原材料 ");
    }
}
