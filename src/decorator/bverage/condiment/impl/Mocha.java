package decorator.bverage.condiment.impl;

import decorator.bverage.Beverage;
import decorator.bverage.condiment.CondimentDecorator;

public class Mocha extends CondimentDecorator{
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription(){
        return beverage.getDescription()+", Mocha ";
    }

    public double cost(){
        return .20+ beverage.cost();
    }
}
