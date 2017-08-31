package factory.client;

import factory.product.Pizza;
import factory.store.PizzaStore;
import factory.store.branch.ChicagoPizzaStore;
import factory.store.branch.NYPizzaStroe;

public class PizzaTestDrive {
    public static void main(String[] args){
        PizzaStore nyPizzaStore=new NYPizzaStroe();
        PizzaStore chicagoPizzaStore=new ChicagoPizzaStore();

        Pizza pizza=nyPizzaStore.orderPizza("cheese");
        System.out.println("Ethan ordered a "+pizza.getName()+"\n");

        pizza=chicagoPizzaStore.orderPizza("cheese");
        System.out.println("Jim ordered a "+pizza.getName()+"\n");

    }
}
