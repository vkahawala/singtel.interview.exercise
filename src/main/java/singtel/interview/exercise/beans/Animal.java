package singtel.interview.exercise.beans;

public interface Animal {
    default String getName() {
        return this.getClass().getSimpleName();
    }
}
