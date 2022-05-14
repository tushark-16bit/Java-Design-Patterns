package streategyPattern.classes.implementations;

import streategyPattern.classes.Duck;
import streategyPattern.classes.concreteClasses.NoFly;
import streategyPattern.classes.concreteClasses.Squeek;

public class RubberDuck extends Duck {
    public RubberDuck(String name) {
        super(name);
        setFlyBehavior(new NoFly());
        setQuackBehavior(new Squeek());
    }
}
