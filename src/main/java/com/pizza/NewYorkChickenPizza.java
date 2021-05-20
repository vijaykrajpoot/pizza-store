package com.pizza;

import java.util.Arrays;

public class NewYorkChickenPizza extends Pizza {

    public NewYorkChickenPizza() {
        name = "NewYorkChickenPizza";
        dough = "Thin Crust";
        cheese = "Mozzarella";
        sauce="Creamy Alfredo";
        toppings = Arrays.asList("Mushrooms", "Onions", "Green peppers", "Black olives");
    }
}
