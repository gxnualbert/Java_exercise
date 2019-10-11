package design.pattern.factory.simplefactory.pizzastore.pizza;

/**
 * @auther gxnualbert
 * @create 2019-10-10-16:35
 */
public class PepperPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println(" 给胡椒披萨准备原材料 ");
    }
}
