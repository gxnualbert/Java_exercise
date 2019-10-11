package design.pattern.factory.factorymethod.pizzastore.order;

import design.pattern.factory.factorymethod.pizzastore.pizza.BJCheesePizza;
import design.pattern.factory.factorymethod.pizzastore.pizza.BJPepperPizza;
import design.pattern.factory.factorymethod.pizzastore.pizza.Pizza;

/**
 * @auther gxnualbert
 * @create 2019-10-11-9:17
 */
public class BJOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
