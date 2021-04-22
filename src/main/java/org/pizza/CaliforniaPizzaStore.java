package org.pizza;

public class CaliforniaPizzaStore implements PizzaStore {
    private Pizza pizza;

    public CaliforniaPizzaStore(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public void makePizza() {
        pizza.prepare();
    }
}
