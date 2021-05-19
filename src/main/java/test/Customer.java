package test;

import com.pizza.IndianTandooriPizza;
import com.pizza.Pizza;
import com.pizza.ingredient.factory.SimplePizzaFactory;
import com.pizza.store.IndianPizzaStore;
import com.pizza.store.NewYorkPizzaStore;
import com.pizza.store.PizzaStore;

public class Customer {

    public static void main(String[] args) {

//        SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
//
//        PizzaStore pizzaStore = new PizzaStore(simplePizzaFactory);
//        Pizza pizza = pizzaStore.orderPizza("cheeze");


        PizzaStore pizzaStore = new IndianPizzaStore();
        Pizza pizza = pizzaStore.orderPizza("buttermasala");
        System.out.println("--------------------------------------------");
        Pizza p = new NewYorkPizzaStore().orderPizza("cheeze");


    }
}
