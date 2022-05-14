package streategyPattern.classes.concreteClasses;

import streategyPattern.classes.interfaces.FlyBehavior;

public class NoFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Can't Fly!");
    }
}
