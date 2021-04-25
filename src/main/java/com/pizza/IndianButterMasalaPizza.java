package com.pizza;

public class IndianButterMasalaPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Prepare ButterMasala pizza");
    }

    @Override
    public void bake() {
        System.out.println("Bake ButterMasala pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cut ButterMasala pizza");
    }

    @Override
    public void box() {
        System.out.println("Boxed ButterMasala pizza");
    }
}
