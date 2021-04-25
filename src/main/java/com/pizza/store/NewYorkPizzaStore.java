package com.pizza.store;

import com.pizza.NewYorkCheezePizza;
import com.pizza.NewYorkChickenPizza;
import com.pizza.Pizza;

public class NewYorkPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String pizzaType) {
        Pizza pizza = null;
        if (pizzaType.equalsIgnoreCase("cheese")) {
            pizza = new NewYorkCheezePizza();
        } else if (pizzaType.equalsIgnoreCase("chicken")) {
            pizza = new NewYorkChickenPizza();
        } else {
            return null;
        }
        return pizza;
    }
}
