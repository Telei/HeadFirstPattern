package abstractFactory.ingredientFactory.impl;

import abstractFactory.ingredientFactory.PizzaIngredientFactory;
import abstractFactory.product.ingredients.*;
import abstractFactory.product.ingredients.impl.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }

    @Override
    public Dough createDough() {
        return  new ThickCrustDough();
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[]={new Garlic(),new Onion(),new Mushroom()};
        return veggies;
    }
}
