package org.pizza;

public class SimplePizzaFactory {

    Pizza createPizza(String pizzaType) {
        Pizza pizza = null;
        if (pizzaType.equalsIgnoreCase("cheese")) {
            pizza = new CheezePizza();
        } else if (pizzaType.equalsIgnoreCase("chicken")) {
            pizza = new ChickenPizza();
        }
        return pizza;
    }

}
