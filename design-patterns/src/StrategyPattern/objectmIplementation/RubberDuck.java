package StrategyPattern.objectmIplementation;

import StrategyPattern.Duck;
import StrategyPattern.behaviorImplementations.NoFly;
import StrategyPattern.behaviorImplementations.Squeek;

public class RubberDuck extends Duck {
    public RubberDuck(String name) {
        super(name);
        setFlyBehavior(new NoFly());
        setQuackBehavior(new Squeek());
    }
}
