package design.pattern.factory.absfactory.pizzastore.pizza;

/**
 * @auther gxnualbert
 * @create 2019-10-11-9:26
 */
public class LDPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦的胡椒pizza");
        System.out.println(" 伦敦的胡椒pizza 准备原材料");
    }
}
