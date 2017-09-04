package abstractFactort.store.branch;

import abstractFactort.ingredientFactory.PizzaIngredientFactory;
import abstractFactort.ingredientFactory.impl.SHPizzaIngredientFactory;
import abstractFactort.product.CheesePizza;
import abstractFactort.product.Pizza;
import abstractFactort.store.PizzaStore;

public class ShanghaiPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza=null;
        PizzaIngredientFactory ingredientFactory=new SHPizzaIngredientFactory();
        if(type.equals("cheese")){
            pizza=new CheesePizza(ingredientFactory);
            pizza.setName("Shang Hai Style Cheese Pizza");
        }

        return pizza;
    }
}
