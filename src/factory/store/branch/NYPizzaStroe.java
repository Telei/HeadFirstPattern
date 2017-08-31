package factory.store.branch;

import factory.product.NYStyleCheesePizza;
import factory.product.Pizza;
import factory.store.PizzaStore;

public class NYPizzaStroe extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        if(type.equals("cheese")){
            return new NYStyleCheesePizza();
        }else return null;
    }
}
