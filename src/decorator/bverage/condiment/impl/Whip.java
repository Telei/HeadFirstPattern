package decorator.bverage.condiment.impl;

import decorator.bverage.Beverage;
import decorator.bverage.condiment.CondimentDecorator;

public class Whip extends CondimentDecorator{
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription(){
        return beverage.getDescription()+" , Whip";
    }

    public double cost(){
        return .50+beverage.cost();
    }
}
