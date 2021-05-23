package com.pizza;

import com.pizza.ingredient.factory.PizzaIngredientFactory;

import java.util.Arrays;

public class NewYorkCheezePizza extends Pizza {

    protected PizzaIngredientFactory pizzaIngredientFactory;

    public NewYorkCheezePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        dough = pizzaIngredientFactory.createDough();
        cheese = pizzaIngredientFactory.createCheese();
        veggies = pizzaIngredientFactory.creatVeggies();
    }

}
