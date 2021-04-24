package org.pizza;

public class CaliforniaPizzaStore extends AbstractPizzaStore {
    private Pizza pizza;

    public CaliforniaPizzaStore(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public void makePizza() {
        pizza.prepare();
    }

    @Override
    public void cutPizza() {

    }


}
