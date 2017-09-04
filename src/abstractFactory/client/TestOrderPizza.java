package abstractFactory.client;

import abstractFactory.product.Pizza;
import abstractFactory.store.PizzaStore;
import abstractFactory.store.branch.NYPizzaStore;
import abstractFactory.store.branch.ShanghaiPizzaStore;

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
