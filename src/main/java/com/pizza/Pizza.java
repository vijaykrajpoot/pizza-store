package com.pizza;

import com.pizza.ingredient.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Pizza {

    protected String name;
    protected String dough;
    protected String sauce;
    protected List<String> toppings = new ArrayList<>();
    protected String cheese;


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
