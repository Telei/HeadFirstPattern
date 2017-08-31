package duckMode.client;

import duckMode.behavior.impl.FlyRocketPowered;
import duckMode.duck.Duck;
import duckMode.duck.impl.MallardDuck;
import duckMode.duck.impl.ModelDuck;

public class MiniDuckSimulator {
    public static void main(String[] args){
        Duck mallard=new MallardDuck();
        mallard.performFly();
        mallard.performQuack();
        mallard.display();

        Duck model=new ModelDuck();
        model.performQuack();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
