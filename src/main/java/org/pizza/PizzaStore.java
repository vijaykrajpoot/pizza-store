package org.pizza;

public class PizzaStore {

    SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();

     public void orderPizza(String pizzaType) {
        Pizza pizza = simplePizzaFactory.createPizza(pizzaType);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }
}
