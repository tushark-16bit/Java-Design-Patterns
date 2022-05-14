package streategyPattern.classes.concreteClasses;

import streategyPattern.classes.interfaces.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quackk!!");
    }
}
