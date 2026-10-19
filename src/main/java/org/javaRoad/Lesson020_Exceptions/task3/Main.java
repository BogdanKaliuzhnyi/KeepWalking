package org.javaRoad.Lesson020_Exceptions.task3;

import org.javaRoad.Lesson020_Exceptions.task3.exception.ArrayValidationException;
import org.javaRoad.Lesson020_Exceptions.task3.model.Animal;
import org.javaRoad.Lesson020_Exceptions.task3.model.Cat;
import org.javaRoad.Lesson020_Exceptions.task3.model.Cow;
import org.javaRoad.Lesson020_Exceptions.task3.model.Dog;
import org.javaRoad.Lesson020_Exceptions.task3.exception.UnknownAnimalException;
import org.javaRoad.Lesson020_Exceptions.task3.service.AnimalArrayCreator;
import org.javaRoad.Lesson020_Exceptions.task3.service.ArrayDataValidator;

/**
 * Переделываем задачу из Lesson18_task1
 */

public class Main {
    public static void main(String[] args) {
        Animal[] animals = AnimalArrayCreator.fillAnimalArray(5);

        try {
            ArrayDataValidator.isValidArray(animals);
            soundAll_instanceof(animals);
        } catch (ArrayValidationException e) {
            System.out.println(e.getMessage());
            System.out.println("Работа программы будет остановлена");
        } catch (UnknownAnimalException e) {
            System.out.println(e.getMessage());
            System.out.println("Кто его сюда добавил?");
        }
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
            throw new UnknownAnimalException("Unknown animal");
        }
    }
}
