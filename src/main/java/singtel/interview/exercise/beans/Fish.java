package singtel.interview.exercise.beans;

import singtel.interview.exercise.behaviours.CanSwim;
import singtel.interview.exercise.behaviours.FishAction;

public abstract class Fish implements Animal, CanSwim, FishAction {
    private String size;
    private String colour;

    public Fish(String size, String colour) {
        this.size = size;
        this.colour = colour;
    }
}
