package org.pizza.test;

import org.pizza.*;

public class CreatePizza {

    public static void main(String[] args) {
        Pizza pizza=new CheezePizza();
        PizzaStore pizzaStore=new CaliforniaPizzaStore(pizza);
        pizza.prepare();

        Pizza chiekenPizza=new ChickenPizza();
        pizzaStore=new CaliforniaPizzaStore(chiekenPizza);
        pizzaStore.makePizza();


    }
}
