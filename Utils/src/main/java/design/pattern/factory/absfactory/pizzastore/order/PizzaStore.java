package design.pattern.factory.absfactory.pizzastore.order;


/**
 * @auther gxnualbert
 * @create 2019-10-11-10:03
 */
public class PizzaStore {
    public static void main(String[] args) {
        new OrderPizza(new BJFactory());
    }
}
