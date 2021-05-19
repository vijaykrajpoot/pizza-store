package com.pizza.store;

import com.pizza.*;

public class IndianPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String pizzaType) {
        Pizza pizza = null;
        if (pizzaType.equalsIgnoreCase("buttermasala")) {
            pizza = new IndianButterMasalaPizza();
            System.out.println("Preparing  " + pizzaType + "pizza ");
        } else if (pizzaType.equalsIgnoreCase("saagpaneer")) {
            System.out.println("Preparing  " + pizzaType + "pizza ");
            pizza = new IndianSaagPaneerPizza();
        } else if (pizzaType.equalsIgnoreCase("tandoor")) {
            System.out.println("Preparing  " + pizzaType + "pizza ");
            pizza = new IndianTandooriPizza();
        } else {
            return null;
        }

        return pizza;
    }
}
