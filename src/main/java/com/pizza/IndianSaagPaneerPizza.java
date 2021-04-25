package com.pizza;

public class IndianSaagPaneerPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Prepare SaagPaneer pizza");
    }

    @Override
    public void bake() {
        System.out.println("Bake SaagPaneer pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cut SaagPaneer pizza");
    }

    @Override
    public void box() {
        System.out.println("Boxed SaagPaneer pizza");
    }
}
