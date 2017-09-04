package abstractFactory.store.branch;

import abstractFactory.ingredientFactory.PizzaIngredientFactory;
import abstractFactory.ingredientFactory.impl.NYPizzaIngredientFactory;
import abstractFactory.product.CheesePizza;
import abstractFactory.product.Pizza;
import abstractFactory.store.PizzaStore;

public class NYPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza=null;
        PizzaIngredientFactory ingredientFactory=new NYPizzaIngredientFactory();
        if(item.equals("cheese")){
            pizza=new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        }
        return pizza;
    }
}
