package com.pizza;

public class VeggiPizza extends Pizza {

    @Override
    void prepare() {
        System.out.println("Preparing VeggiePizza");
    }
}
