package duckMode.behavior.impl;

import duckMode.behavior.QuackBehavior;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
