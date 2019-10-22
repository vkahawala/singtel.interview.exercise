package singtel.interview.exercise.behaviours;

public interface CanWalk extends AnimalActivity {
    default void walk() {
        System.out.println("I am walking");
    }
}
