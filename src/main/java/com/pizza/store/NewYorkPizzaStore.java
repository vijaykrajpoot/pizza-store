package com.pizza.store;

import com.pizza.NewYorkCheezePizza;
import com.pizza.NewYorkChickenPizza;
import com.pizza.Pizza;
import com.pizza.ingredient.factory.PizzaIngredientFactory;

public class NewYorkPizzaStore extends PizzaStore {



    @Override
    protected Pizza createPizza(String pizzaType) {
    PizzaIngredientFactory pizzaIngredientFactory=new
        Pizza pizza = null;
        if (pizzaType.equalsIgnoreCase("cheeze")) {
            pizza = new NewYorkCheezePizza();
        } else if (pizzaType.equalsIgnoreCase("chicken")) {
            pizza = new NewYorkChickenPizza();
        } else {
            return null;
        }
        return pizza;
    }
}
