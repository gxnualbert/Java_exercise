package design.pattern.factory.absfactory.pizzastore.pizza;

/**
 * @auther gxnualbert
 * @create 2019-10-11-9:25
 */
public class BJPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京的胡椒pizza");
        System.out.println(" 北京的胡椒pizza 准备原材料");
    }
}
