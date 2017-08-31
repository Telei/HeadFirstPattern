package duckMode.behavior.impl;

import duckMode.behavior.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack!!");
    }
}
