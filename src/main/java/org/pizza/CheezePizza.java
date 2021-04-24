package org.pizza;

public class CheezePizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("preparing cheeze Pizza!");
    }

    @Override
    public void cutPizza() {
        System.out.println("Triangle Cut Pizza");
    }
}
