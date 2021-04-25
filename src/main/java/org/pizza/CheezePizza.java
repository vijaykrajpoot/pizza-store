package org.pizza;

public class CheezePizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Prepare Cheese pizza");
    }

    @Override
    public void bake() {
        System.out.println("Bake Cheese pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cut Cheese pizza");
    }

    @Override
    public void box() {
        System.out.println("Boxed Cheese pizza");
    }
}
