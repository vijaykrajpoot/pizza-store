package com.pizza;

import com.pizza.ingredient.Cheese;
import com.pizza.ingredient.Dough;
import com.pizza.ingredient.Sauce;
import com.pizza.ingredient.Veggies;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected List<Veggies> veggies;
    protected Cheese cheese;


//    public void prepare() {
//        System.out.println("Preparing '" + name + "' pizza");
//        System.out.println("Tossing : '" + dough);
//        System.out.println("Adding :" + cheese);
//        System.out.println("Adding :" + sauce);
//        System.out.println("Adding toppings:  " + veggies.toString());
//
//
//    }


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

    abstract void prepare();

}
