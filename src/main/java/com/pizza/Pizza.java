package com.pizza;

import com.pizza.ingredient.*;

import java.util.Arrays;

public abstract class Pizza {
    
    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Veggies[] veggies;
    protected Cheese cheese;
    protected Pepperoni pepperoni;

    abstract void prepare();


    public void bake() {
        System.out.println("Baking....");
    }

    public void cut() {
        System.out.println("Cut...");
    }

    public void box() {
        System.out.println("Boxing it");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "AbstractPizza{" +
                "name='" + name + '\'' +
                ", dough=" + dough +
                ", sauce=" + sauce +
                ", veggies=" + Arrays.toString(veggies) +
                ", cheese=" + cheese +
                ", pepperoni=" + pepperoni +
                '}';
    }
}
