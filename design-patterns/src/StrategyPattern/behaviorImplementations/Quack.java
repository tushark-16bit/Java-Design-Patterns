package StrategyPattern.behaviorImplementations;

import StrategyPattern.behaviorInterfaces.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quackk!!");
    }
}
