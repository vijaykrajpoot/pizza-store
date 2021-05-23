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

    public void bake() {
        System.out.println("Baking....");
    }

    public void cut() {
        System.out.println("Cut...");
    }

    public void box() {
        System.out.println("Boxing it");
    }

    public abstract void prepare();



}
