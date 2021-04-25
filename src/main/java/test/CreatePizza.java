package test;

import com.pizza.store.IndianPizzaStore;
import com.pizza.store.NewYorkPizzaStore;
import com.pizza.store.PizzaStore;

public class CreatePizza {

    public static void main(String[] args) {

        PizzaStore pizzaStore=new NewYorkPizzaStore();
        pizzaStore.orderPizza("cheese");


        pizzaStore=new IndianPizzaStore();
        pizzaStore.orderPizza("tandoori");

    }
}