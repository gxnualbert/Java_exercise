package design.pattern.factory.absfactory.pizzastore.pizza;

/**
 * @auther gxnualbert
 * @create 2019-10-11-9:24
 */
public class BJCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京的奶酪pizza");
        System.out.println(" 北京的奶酪pizza 准备原材料");
    }
}
