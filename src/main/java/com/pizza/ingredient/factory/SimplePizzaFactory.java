package com.pizza.ingredient.factory;

import com.pizza.*;

public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        Pizza pizza = null;

//        if (type.equalsIgnoreCase("cheeze")) {
//            System.out.println("Preparing cheeze pizza");
//            pizza = new CheezePizza();
//        } else if (type.equalsIgnoreCase("veggie")) {
//            System.out.println("Preparing veggie pizza");
//            pizza = new IndianVeggiPizza();
//        } else if (type.equalsIgnoreCase("clam")) {
//            System.out.println("Preparing clam pizza");
//            pizza = new NewYorkClamPizza();
//        } else if (type.equalsIgnoreCase("pepperoni")) {
//            System.out.println("Preparing pepperoni pizza");
//            pizza = new PepperoniPizza();
//        }
        return pizza;
    }
}
