package com.pizza.store;

import com.pizza.Pizza;

public abstract class PizzaStore {

    public void orderPizza(String pizzaType) {
        Pizza pizza = createPizza(pizzaType);
        pizza.bake();
        pizza.cut();
        pizza.box();
    }

    abstract Pizza createPizza(String pizzaType);
}
