package com.pizza;

public class ClamPizza extends Pizza {

    @Override
    void prepare() {
        System.out.println("Preparing VeggiePizza");
    }
}
