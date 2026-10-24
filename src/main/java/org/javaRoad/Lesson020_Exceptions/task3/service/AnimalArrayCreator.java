package org.javaRoad.Lesson020_Exceptions.task3.service;

import org.javaRoad.Lesson020_Exceptions.task3.model.Animal;
import org.javaRoad.Lesson020_Exceptions.task3.model.Cat;
import org.javaRoad.Lesson020_Exceptions.task3.model.Cow;
import org.javaRoad.Lesson020_Exceptions.task3.model.Dog;

import java.util.Random;

public class AnimalArrayCreator {
    public static Animal[] fillAnimalArray(int length) {
        Random random = new Random();
        Animal[] animals = new Animal[length];
        String[] animalColors = {"Black", "White", "Spotted", "Reddish", "Grey"};
        for (int i = 0; i < animals.length; i++) {
            switch (random.nextInt(5)) {
                case 0:
                    animals[i] = new Dog(animalColors[random.nextInt(5)]);
                    break;
                case 1:
                    animals[i] = new Cat(animalColors[random.nextInt(5)]);
                    break;
                case 2:
                    animals[i] = new Cow(animalColors[random.nextInt(5)]);
                    break;
                case 3:
                    animals[i] = new Animal(null);
                    break;
                case 4:
                    animals[i] = null;
            }
        }
        return animals;
    }
}
