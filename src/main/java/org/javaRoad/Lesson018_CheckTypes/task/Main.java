package org.javaRoad.Lesson018_CheckTypes.task;

import org.javaRoad.Lesson018_CheckTypes.task.Model.Animal;
import org.javaRoad.Lesson018_CheckTypes.task.Model.Cat;
import org.javaRoad.Lesson018_CheckTypes.task.Model.Cow;
import org.javaRoad.Lesson018_CheckTypes.task.Model.Dog;

import java.util.Random;

/**
 * Переделываем задачу из Lesson13_task2
 */

public class Main {
    public static void main(String[] args) {
        Animal[] animals = fillAnimalArray(new Animal[5]);

        System.out.println("Первый вариант, instanceof");
        soundAll_instanceof(animals);
        System.out.println("Второй вариант, getClass()");
        soundAll_getClass(animals);
    }

    private static Animal[] fillAnimalArray(Animal[] animals) {
        Random random = new Random();
        String[] animalColors = {"Black", "White", "Spotted", "Reddish", "Grey"};
        for (int i = 0; i < animals.length; i++) {
            switch (random.nextInt(3)) {
                case 0:
                    animals[i] = new Dog(animalColors[random.nextInt(5)]);
                    break;
                case 1:
                    animals[i] = new Cat(animalColors[random.nextInt(5)]);
                    break;
                case 2:
                    animals[i] = new Cow(animalColors[random.nextInt(5)]);
                    break;
                default:
                    System.out.println("Что то пошло не так");
            }
        }
        return animals;
    }

    private static void soundAll_instanceof(Animal[] animals) {
        for (Animal animal : animals) {
            if (animal != null) {
                sound_instanceof(animal);
            }
        }
    }

    private static void sound_instanceof(Animal animal) {
        if (animal instanceof Cat cat) {
            cat.meow();
        } else if (animal instanceof Cow cow) {
            cow.moo();
        } else if (animal instanceof Dog dog) {
            dog.woof();
        } else {
            System.out.println("Unknown animal");
        }
    }

    private static void soundAll_getClass(Animal[] animals) {
        for (Animal animal : animals) {
            if (animal != null) {
                sound_getClass(animal);
            }
        }
    }

    private static void sound_getClass(Animal animal) {
        if (Cat.class.equals(animal.getClass())) {
            ((Cat)animal).meow();
        } else if (Cow.class.equals(animal.getClass())) {
            ((Cow)animal).moo();
        } else if (Dog.class.equals(animal.getClass())) {
            ((Dog)animal).woof();
        } else {
            System.out.println("Unknown animal");
        }
    }
}
