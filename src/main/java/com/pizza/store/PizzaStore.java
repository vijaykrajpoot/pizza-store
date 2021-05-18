package com.pizza.store;

import com.pizza.Pizza;
import com.pizza.ingredient.factory.SimplePizzaFactory;

public class PizzaStore {
    private final SimplePizzaFactory simplePizzaFactory;

    public PizzaStore(SimplePizzaFactory simplePizzaFactory) {
        this.simplePizzaFactory = simplePizzaFactory;
    }

    public Pizza orderPizza(String pizzaType) {
        Pizza pizza = simplePizzaFactory.createPizza(pizzaType);
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }


}
