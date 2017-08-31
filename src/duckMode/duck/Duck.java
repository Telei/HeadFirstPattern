package duckMode.duck;

import duckMode.behavior.FlyBehavior;
import duckMode.behavior.QuackBehavior;

public abstract class Duck {
    public  FlyBehavior flyBehavior;
    public  QuackBehavior quackBehavior;
    public  Duck(){

    }
    public abstract void display();

    //动态改变鸭子行为
    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior=fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

    //委托行为类
    public void performFly(){
        flyBehavior.fly();
    }
    public void performQuack(){
        quackBehavior.quack();
    }
    public void swim(){
        System.out.println("All ducks float, even decoys");
    }
}
