package design.pattern.factory.factorymethod.pizzastore.order;

/**
 * @auther gxnualbert
 * @create 2019-10-11-9:19
 */
public class PizzaStore {
    public static void main(String[] args) {

        String loc = "bjsd";
        if (loc.equals("bj")) {
            //创建北京口味的各种Pizza
            new BJOrderPizza();
        } else {
            //创建伦敦口味的各种Pizza
            new LDOrderPizza();
        }
    }
}
