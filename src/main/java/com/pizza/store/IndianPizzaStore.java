package com.pizza.store;

import com.pizza.*;

public class IndianPizzaStore {

    Pizza createPizza(String pizzaType) {
        Pizza pizza = null;
        if (pizzaType.equalsIgnoreCase("buttermasala")) {
            pizza = new IndianButterMasalaPizza();
        } else if (pizzaType.equalsIgnoreCase("saagpaneer")) {
            pizza = new IndianSaagPaneerPizza();
        } else if (pizzaType.equalsIgnoreCase("tandoori")) {
            pizza = new IndianTandooriPizza();
        } else {
            return null;
        }
        return pizza;
    }
}
