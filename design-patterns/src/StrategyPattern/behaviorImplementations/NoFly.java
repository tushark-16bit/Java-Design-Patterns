package StrategyPattern.behaviorImplementations;

import StrategyPattern.behaviorInterfaces.FlyBehavior;

public class NoFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Can't Fly!");
    }
}
