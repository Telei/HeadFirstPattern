package decorator.bverage.condiment;

import decorator.bverage.Beverage;

/**
 * 调料装饰者
 */
public  abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
