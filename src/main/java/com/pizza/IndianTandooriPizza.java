package com.pizza;

public class IndianTandooriPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Prepare Tandoori pizza");
    }

    @Override
    public void bake() {
        System.out.println("Bake Tandoori pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cut Tandoori pizza");
    }

    @Override
    public void box() {
        System.out.println("Boxed Tandoori pizza");
    }
}
