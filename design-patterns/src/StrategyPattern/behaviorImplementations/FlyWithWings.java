package StrategyPattern.behaviorImplementations;

import StrategyPattern.behaviorInterfaces.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Fly WIth Wings, Yeaahhh Baby!!!");
    }
}
