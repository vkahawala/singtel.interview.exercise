package singtel.interview.exercise.util;

import singtel.interview.exercise.behaviours.*;

public class AnimalActivityFectory {

    public static Class<? extends AnimalActivity> getActivity(String activity) {
        switch (activity) {
            case "fly":
                return CanFly.class;
            case "walk":
                return CanWalk.class;
            case "swim":
                return CanSwim.class;
            case "sing":
                return CanSing.class;
            case "talk":
                return CanMakeSound.class;
            default:
                throw new RuntimeException("Invalid animal activity");
        }
    }
}
