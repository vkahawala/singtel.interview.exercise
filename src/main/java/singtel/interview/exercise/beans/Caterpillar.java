package singtel.interview.exercise.beans;

import singtel.interview.exercise.behaviours.Transformable;

public class Caterpillar extends WalkingAnimal implements Transformable {

    @Override
    public Animal transform() {
        return new Butterfly();
    }
}
