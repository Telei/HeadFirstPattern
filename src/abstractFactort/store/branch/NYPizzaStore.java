package abstractFactort.store.branch;

import abstractFactort.ingredientFactory.PizzaIngredientFactory;
import abstractFactort.ingredientFactory.impl.NYPizzaIngredientFactory;
import abstractFactort.product.CheesePizza;
import abstractFactort.product.Pizza;
import abstractFactort.store.PizzaStore;

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
