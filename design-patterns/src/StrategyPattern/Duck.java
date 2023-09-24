package StrategyPattern;

import StrategyPattern.behaviorInterfaces.FlyBehavior;
import StrategyPattern.behaviorInterfaces.QuackBehavior;

public abstract class Duck {
    String name;
    FlyBehavior fly;
    QuackBehavior quack;
    public Duck(String name) {
        this.name = name;
    }

    public FlyBehavior getFlyable() {
        return fly;
    }

    public void setFlyBehavior(FlyBehavior flyable) {
        this.fly = flyable;
    }

    public QuackBehavior getQuackBehavior() {
        return quack;
    }

    public void setQuackBehavior(QuackBehavior quackable) {
        this.quack = quackable;
    }

    public void fly() {
        fly.fly();
    }

    public void quack() {
        quack.quack();
    }
}
