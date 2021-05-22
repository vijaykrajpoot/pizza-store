package com.pizza;

import com.pizza.ingredient.factory.PizzaIngredientFactory;

import java.util.Arrays;

public class NewYorkCheezePizza extends Pizza {

    protected PizzaIngredientFactory pizzaIngredientFactory;

    public NewYorkCheezePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    public NewYorkCheezePizza() {
        name = "NewYorkCheezePizza";
        cheese = "Mozzarella";
        dough = "Thin Crust";
        toppings = Arrays.asList("Black olives", "Mushrooms");
    }


}

