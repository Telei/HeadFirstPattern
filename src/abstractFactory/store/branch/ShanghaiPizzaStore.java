package abstractFactory.store.branch;

import abstractFactory.ingredientFactory.PizzaIngredientFactory;
import abstractFactory.ingredientFactory.impl.SHPizzaIngredientFactory;
import abstractFactory.product.CheesePizza;
import abstractFactory.product.Pizza;
import abstractFactory.store.PizzaStore;

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
