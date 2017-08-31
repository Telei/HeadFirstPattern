package factory.store.branch;

import factory.product.ChicagoStyleCheesePizza;
import factory.product.Pizza;
import factory.store.PizzaStore;

public class ChicagoPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        if(type.equals("cheese")){
            return new ChicagoStyleCheesePizza();
        }else return null;
    }
}
