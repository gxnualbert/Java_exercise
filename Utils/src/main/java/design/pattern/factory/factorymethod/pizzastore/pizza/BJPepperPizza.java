package design.pattern.factory.factorymethod.pizzastore.pizza;

/**
 * @auther gxnualbert
 * @create 2019-10-11-9:06
 */
public class BJPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京的胡椒pizza");
        System.out.println(" 北京的胡椒pizza 准备原材料");
    }
}
