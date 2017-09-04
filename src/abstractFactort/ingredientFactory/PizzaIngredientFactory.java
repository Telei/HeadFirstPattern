package abstractFactort.ingredientFactory;

import abstractFactort.product.ingredients.*;

public interface PizzaIngredientFactory {
    public Cheese createCheese();
    public Clams createClam();
    public Dough createDough();
    public Pepperoni createPepperoni();
    public Sauce createSauce();
    public Veggies[] createVeggies();

}
