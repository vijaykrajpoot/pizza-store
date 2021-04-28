package com.pizza.ingredient.factory;

import com.pizza.ingredient.Cheese;
import com.pizza.ingredient.Dough;
import com.pizza.ingredient.Sauce;

public interface PizzaIngredientFactory {

    Dough createDough();

    Sauce createSauces();

    Cheese createCheese();


}
