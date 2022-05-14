package streategyPattern.classes.concreteClasses;

import streategyPattern.classes.interfaces.QuackBehavior;

public class Squeek implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeek");
    }
}
