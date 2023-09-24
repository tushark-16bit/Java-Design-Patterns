package StrategyPattern.behaviorImplementations;

import StrategyPattern.behaviorInterfaces.QuackBehavior;

public class Squeek implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeek");
    }
}
