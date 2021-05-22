package com.pizza.ingredient.factory;

import com.pizza.ingredient.*;

public class NewYorkPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauces() {
        return new Sauce() {
        };
    }

    @Override
    public Cheese createCheese() {
        return null;
    }

    @Override
    public Veggies[] creatVeggies() {
        return new Veggies[0];
    }
}
