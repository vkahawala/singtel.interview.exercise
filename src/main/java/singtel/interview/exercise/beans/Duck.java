package singtel.interview.exercise.beans;

import singtel.interview.exercise.behaviours.CanMakeSound;
import singtel.interview.exercise.behaviours.CanSwim;

public class Duck extends FlyingBird implements CanMakeSound, CanSwim {

    @Override
    public void makeSound() {
        System.out.println("Quack, quack");
    }
}
