package org.pizza.test;

import org.pizza.CaliforniaPizzaStore;
import org.pizza.CheezePizza;
import org.pizza.Pizza;
import org.pizza.PizzaStore;

public class CreatePizza {

    public static void main(String[] args) {
        Pizza pizza=new CheezePizza();
        PizzaStore pizzaStore=new CaliforniaPizzaStore(pizza);
        pizza.prepare();
    }
}
