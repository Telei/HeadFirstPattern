package decorator.client;

import decorator.bverage.Beverage;
import decorator.bverage.bverageKind.Espresso;
import decorator.bverage.bverageKind.HouseBlend;
import decorator.bverage.condiment.impl.Mocha;
import decorator.bverage.condiment.impl.Soy;
import decorator.bverage.condiment.impl.Whip;

public class StarbuzzCoffee {

    public static void main(String[] ages){

        Beverage beverage=new Espresso();
        System.out.println(beverage.getDescription()+" $"+beverage.cost());

        Beverage beverage1=new HouseBlend();
        beverage1.setSize(Beverage.Size.VENTI);
        //beverage1=new Soy(beverage1);
        beverage1=new Mocha(beverage1);
        beverage1=new Whip(beverage1);

        System.out.println(beverage1.getDescription()+" $"+beverage1.cost());

    }
}
