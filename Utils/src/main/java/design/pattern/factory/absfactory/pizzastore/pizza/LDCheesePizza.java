package design.pattern.factory.absfactory.pizzastore.pizza;

/**
 * @auther gxnualbert
 * @create 2019-10-11-9:25
 */
public class LDCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦的奶酪pizza");
        System.out.println(" 伦敦的奶酪pizza 准备原材料");
    }
}
