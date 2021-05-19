package com.pizza.store;

import com.pizza.Pizza;
import com.pizza.ingredient.factory.SimplePizzaFactory;

public abstract class PizzaStore {

    public Pizza orderPizza(String pizzaType) {
        Pizza pizza = createPizza(pizzaType);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    abstract protected Pizza createPizza(String pizzaType);

}
