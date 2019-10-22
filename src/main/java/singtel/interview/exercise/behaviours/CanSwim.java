package singtel.interview.exercise.behaviours;

public interface CanSwim extends AnimalActivity {
    default void swim() {
        System.out.println("I am swimming");
    }
}
