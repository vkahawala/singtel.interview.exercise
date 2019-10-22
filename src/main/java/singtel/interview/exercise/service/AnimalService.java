package singtel.interview.exercise.service;

import org.springframework.stereotype.Service;
import singtel.interview.exercise.beans.*;
import singtel.interview.exercise.behaviours.AnimalActivity;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AnimalService {

    private List<Animal> animals;

    @PostConstruct
    void init() {
        animals = new ArrayList<>();
        Animal[] animalTypes = new Animal[]{
                new Cat(),
                new Dog(),
                new Butterfly(),
                new Caterpillar(),
                new Chicken(),
                new Rooster(),
                new ClownFish(),
                new Dolphin(),
                new Duck(),
                new Parrot(new Dog()),
                new Parrot(new Cat()),
                new Parrot(new Rooster()),
                new Shark()
        };
        animals.addAll(Arrays.asList(animalTypes));
    }

    public int count(Class<? extends AnimalActivity> activity) {
        return (int) animals.stream().filter(activity::isInstance).count();
    }

    public List<String> listAnimals(Class<? extends AnimalActivity> activity) {
        return animals.stream().filter(activity::isInstance).map(Animal::getName)
                .collect(Collectors.toList());
    }

    public List<String> listAnimals() {
        return animals.stream().map(Animal::getName).collect(Collectors.toList());
    }

}
