package singtel.interview.exercise.beans;

import singtel.interview.exercise.behaviours.CanMakeSound;

public class Cat extends WalkingAnimal implements CanMakeSound {

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}
