package org.pizza.test;

import org.pizza.*;

public class CreatePizza {

    public static void main(String[] args) {

        PizzaStore pizzaStore=new PizzaStore();
        pizzaStore.orderPizza("chicken");
        pizzaStore.orderPizza("cheese");

    }
}
