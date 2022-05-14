package streategyPattern.classes.concreteClasses;

import streategyPattern.classes.interfaces.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Fly WIth Wings, Yeaahhh Baby!!!");
    }
}
