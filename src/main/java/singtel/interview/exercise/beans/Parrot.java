package singtel.interview.exercise.beans;

import singtel.interview.exercise.behaviours.CanMakeSound;
import singtel.interview.exercise.behaviours.CanSing;

public class Parrot extends FlyingBird implements CanSing {
    private CanMakeSound livesWith;

    public Parrot(CanMakeSound livesWith) {
        this.livesWith = livesWith;
    }

    @Override
    public void sing() {
        livesWith.makeSound();
    }

    @Override
    public String getName() {
        return super.getName().concat(" living with ").concat(livesWith.getClass().getSimpleName());
    }
}
