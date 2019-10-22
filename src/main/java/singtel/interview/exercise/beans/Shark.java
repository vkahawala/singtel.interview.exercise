package singtel.interview.exercise.beans;

public class Shark extends Fish {

    public Shark() {
        super("Large", "Grey");
    }

    @Override
    public void act() {
        System.out.println("I eat fish");
    }
}
