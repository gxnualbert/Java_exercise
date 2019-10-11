package design.pattern.factory.factorymethod.pizzastore.pizza;

/**
 * @auther gxnualbert
 * @create 2019-10-11-9:06
 */
public class LDCheesePizza extends Pizza{
    @Override
    public void prepare() {
        setName("伦敦的奶酪pizza"); //可以直接调用父类的方法
        System.out.println(" 伦敦的奶酪pizza 准备原材料");
    }
}
