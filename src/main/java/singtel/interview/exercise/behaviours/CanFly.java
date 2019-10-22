package singtel.interview.exercise.behaviours;

public interface CanFly extends AnimalActivity {

    default void fly() {
        System.out.println("I am flying");
    }
}
