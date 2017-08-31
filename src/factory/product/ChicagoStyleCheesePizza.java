package factory.product;

public class ChicagoStyleCheesePizza extends Pizza{
    public ChicagoStyleCheesePizza(){
        name="Chicago Style Deep and Dish Cheese Pizza";
        dough="Extra Thin Crust Dough";
        sauce="Plum Tomato Sauce";
        toppings.add("Shredded Mozzarella Cheese");
    }
    public void cut(){
        System.out.println("Cutting the Pizza into square slice");
    }
}
