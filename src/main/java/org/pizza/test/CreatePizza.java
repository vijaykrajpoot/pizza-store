package org.pizza.test;

import org.pizza.*;

public class CreatePizza {

    public static void main(String[] args) {
        SimplePizzaFactory simplePizzaFactory=new SimplePizzaFactory();
        PizzaStore pizzaStore=new PizzaStore(simplePizzaFactory);
        pizzaStore.orderPizza("chicken");
        pizzaStore.orderPizza("cheese");

    }
}
