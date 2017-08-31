package factory.product;

import java.util.ArrayList;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList toppings=new ArrayList();

   public void prepare(){
        System.out.println("Prepare "+name);
        System.out.println("Tossing dough "+dough);
        System.out.println("Adding sauce... ");
        System.out.println("Adding topping: ");
        for (int i = 0; i <toppings.size() ; i++) {
            System.out.println(" "+toppings.get(i));
        }
    }

    public void bake(){
        System.out.println("Bake for 25 minute an 350 ");
    }

    public void cut(){
        System.out.println("Cutting the pizza into diagonal");
    }

    public void box(){
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }
}
