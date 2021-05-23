package com.pizza.ingredient.factory;

import com.pizza.ingredient.*;

import java.util.Arrays;
import java.util.List;

public class NewYorkPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauces() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public List<Veggies> creatVeggies() {
        return Arrays.asList(
                new Onion(),
                new Garlic()
        );
    }
}
