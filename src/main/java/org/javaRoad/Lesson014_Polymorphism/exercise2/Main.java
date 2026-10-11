package org.javaRoad.Lesson014_Polymorphism.exercise2;

import org.javaRoad.Lesson014_Polymorphism.exercise2.Model.Animal;
import org.javaRoad.Lesson014_Polymorphism.exercise2.Model.Cat;
import org.javaRoad.Lesson014_Polymorphism.exercise2.Model.Cow;
import org.javaRoad.Lesson014_Polymorphism.exercise2.Model.Dog;

import java.util.Random;

public class Main {
    private static Random random = new Random();
    public static void main(String[] args) {
        Animal[] animals = fillAnimalArray(new Animal[5]);

        soundAll(animals);
        System.out.println("Зверюга\n\n");
       // soundAll1(animals);

    }

    private static Animal[] fillAnimalArray(Animal[] animals) {
        for (int i = 0; i < animals.length; i++) {
            switch (random.nextInt(3)) {
                case 0:
                    animals[i] = new Dog();
                    break;
                case 1:
                    animals[i] = new Cat();
                    break;
                case 2:
                    animals[i] = new Cow();
                    break;
                default:
                    System.out.println("Что то пошло не так");
            }
        }
        return animals;
    }

    private static void soundAll(Animal[] animals) {
        for (Animal animal : animals) {
            animal.sound();
        }
    }

//    private static void soundAll1(Animal[] animals) {
//        for (Animal animal : animals) {
//            sound(animal);
//        }
//    }

//    private static void sound(Animal animal) {
//        switch (animal.getClassName()) {
//            case Cat.CAT_CLASS_NAME -> ((Cat) animal).sound();
//            case Dog.DOG_CLASS_NAME -> ((Dog) animal).sound();
//            case Cow.COW_CLASS_NAME -> ((Cow) animal).sound();
//            default -> System.out.println("Unknown animal");
//        }
//    }
}
