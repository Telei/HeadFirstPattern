package duckMode.duck.impl;

import duckMode.behavior.impl.FlyNoWay;
import duckMode.behavior.impl.Quack;
import duckMode.duck.Duck;

public class ModelDuck extends Duck {

    public ModelDuck(){
        flyBehavior=new FlyNoWay();
        quackBehavior=new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck!");
    }
}
