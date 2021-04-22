package org.pizza;

public class CheezePizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("preparing cheeze Pizza!");
    }
}
