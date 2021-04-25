package org.pizza;

public class PizzaStore {

   private SimplePizzaFactory simplePizzaFactory ;

    public PizzaStore(SimplePizzaFactory simplePizzaFactory) {
        this.simplePizzaFactory = simplePizzaFactory;
    }

    public void orderPizza(String pizzaType) {
        Pizza pizza = simplePizzaFactory.createPizza(pizzaType);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }
}
