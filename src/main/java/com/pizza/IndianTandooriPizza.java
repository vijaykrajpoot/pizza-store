package com.pizza;

public class IndianTandooriPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Prepare Tandoori pizza");
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }
}

