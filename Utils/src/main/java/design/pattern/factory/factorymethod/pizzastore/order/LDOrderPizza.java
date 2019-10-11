package design.pattern.factory.factorymethod.pizzastore.order;

import design.pattern.factory.factorymethod.pizzastore.pizza.LDCheesePizza;
import design.pattern.factory.factorymethod.pizzastore.pizza.LDPepperPizza;
import design.pattern.factory.factorymethod.pizzastore.pizza.Pizza;

/**
 * @auther gxnualbert
 * @create 2019-10-11-9:18
 */
public class LDOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
