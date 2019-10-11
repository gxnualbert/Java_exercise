package design.pattern.factory.factorymethod.pizzastore.pizza;

/**
 * @auther gxnualbert
 * @create 2019-10-11-9:08
 */
public class LDPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦的胡椒pizza");
        System.out.println(" 伦敦的胡椒pizza 准备原材料");
    }
}
