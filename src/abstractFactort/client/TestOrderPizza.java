package abstractFactort.client;

import abstractFactort.product.Pizza;
import abstractFactort.store.PizzaStore;
import abstractFactort.store.branch.NYPizzaStore;
import abstractFactort.store.branch.ShanghaiPizzaStore;

public class TestOrderPizza {
    public static void main(String[] args){
        PizzaStore pizzaStore=new NYPizzaStore();
        Pizza pizza=pizzaStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza + "\n");

        pizzaStore=new ShanghaiPizzaStore();
        pizza=pizzaStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza + "\n");
    }
}
