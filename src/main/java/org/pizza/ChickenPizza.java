package org.pizza;

public class ChickenPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("preparing chicken Pizza!");
    }
}
