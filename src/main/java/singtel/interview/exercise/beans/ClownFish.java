package singtel.interview.exercise.beans;

public class ClownFish extends Fish {

    public ClownFish() {
        super("Small", "Orange");
    }

    @Override
    public void act() {
        System.out.println("I make jokes");
    }
}
