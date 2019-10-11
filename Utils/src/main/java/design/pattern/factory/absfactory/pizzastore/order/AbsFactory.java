package design.pattern.factory.absfactory.pizzastore.order;


import design.pattern.factory.absfactory.pizzastore.pizza.Pizza;
/**
 * @auther gxnualbert
 * @create 2019-10-11-9:43
 */

//一个抽象工厂模式的抽象层(接口)
public  interface AbsFactory {
    //让下面的工厂子类来 具体实现
    public Pizza createPizza(String orderType);
}
