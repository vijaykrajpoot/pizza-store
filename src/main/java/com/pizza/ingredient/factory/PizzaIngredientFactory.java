package com.pizza.ingredient.factory;

import com.pizza.ingredient.Cheese;
import com.pizza.ingredient.Dough;
import com.pizza.ingredient.Sauce;
import com.pizza.ingredient.Veggies;

public interface PizzaIngredientFactory {

    Dough createDough();

    Sauce createSauces();

    Cheese createCheese();

    Veggies [] creatVeggies();


}
