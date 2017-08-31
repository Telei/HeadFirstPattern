package duckMode.duck.impl;

import duckMode.behavior.impl.FlyWithWings;
import duckMode.behavior.impl.Quack;
import duckMode.duck.Duck;

public class MallardDuck extends Duck {

    public MallardDuck(){
        flyBehavior=new FlyWithWings();
        quackBehavior=new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a mallard duck!");
    }
}
