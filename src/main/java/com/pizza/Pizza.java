package com.pizza;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

    protected String name;
    protected String dough = "Thin Crust";
    protected String sauce = "Creamy Alfredo";
    protected List<String> toppings = new ArrayList<>();
    protected String cheese = "Mozzarella";


    public void prepare() {
        System.out.println("Preparing '" + name + "' pizza");
        System.out.println("Tossing : '" + dough);
        System.out.println("Adding :" + cheese);
        System.out.println("Adding :" + sauce);
        System.out.println("Adding toppings:  " + toppings.toString());


    }


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


}
