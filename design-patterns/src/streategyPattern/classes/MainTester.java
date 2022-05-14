package streategyPattern.classes;

import streategyPattern.classes.concreteClasses.FlyWithWings;
import streategyPattern.classes.implementations.RubberDuck;

/**
 * This is composition instead of inheritance, where you can change the behavior
 * of the attribute at any time
 */
public class MainTester {
    public static void main(String[] args) {
        RubberDuck rubberDuck = new RubberDuck("Ducky");
        rubberDuck.fly();
        rubberDuck.quack();
        rubberDuck.setFlyBehavior(new FlyWithWings());
        rubberDuck.fly();
    }
}
