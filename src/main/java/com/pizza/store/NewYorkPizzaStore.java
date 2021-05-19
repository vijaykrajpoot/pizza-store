package com.pizza.store;

import com.pizza.NewYorkCheezePizza;
import com.pizza.NewYorkChickenPizza;
import com.pizza.Pizza;

public class NewYorkPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String pizzaType) {
        Pizza pizza = null;
        if (pizzaType.equalsIgnoreCase("cheeze")) {
            System.out.println("Preparing  " + pizzaType + "pizza ");
            pizza = new NewYorkCheezePizza();
        } else if (pizzaType.equalsIgnoreCase("chicken")) {
            System.out.println("Preparing  " + pizzaType + "pizza ");
            pizza = new NewYorkChickenPizza();
        } else {
            return null;
        }
        return pizza;
    }
}
