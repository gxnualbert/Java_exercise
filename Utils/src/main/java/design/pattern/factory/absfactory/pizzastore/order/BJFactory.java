package design.pattern.factory.absfactory.pizzastore.order;


import design.pattern.factory.absfactory.pizzastore.pizza.*;
/**
 * @auther gxnualbert
 * @create 2019-10-11-9:57
 */
public class BJFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("~使用的是抽象工厂模式~");
        Pizza pizza = null;
        if(orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")){
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
