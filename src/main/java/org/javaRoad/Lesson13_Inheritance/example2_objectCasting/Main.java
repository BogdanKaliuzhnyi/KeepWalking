package org.javaRoad.Lesson13_Inheritance.example2_objectCasting;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = fillAnimalArray(new Animal[5]);

        soundAll(animals);
        for (Animal a : animals) {
            System.out.println(a.color); // Поля не полиморфны, вызываются из суперкласса
            a.sound();                    // А вот методы вызываются из объекта (фактического типа объекта
            // дочернего класса), а не из типа переменной
        }

        Animal animal = new Dog("Чёрный");
        //animal.bark();
        Dog dog = (Dog) animal;
        dog.bark();
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

    private static void soundAll(Animal[] animals) {
        for (Animal animal : animals) {
            animal.sound();
        }
    }

    private static void soundAll1(Animal[] animals) {
        for (Animal animal : animals) {
            sound(animal);
        }
    }

    private static void sound(Animal animal) {
        switch(animal.getClassName()) {
            case Cat.CAT_CLASS_NAME -> ((Cat) animal).sound();
            case Dog.DOG_CLASS_NAME -> ((Dog) animal).sound();
            case Cow.COW_CLASS_NAME -> ((Cow) animal).sound();
            default -> System.out.println("Unknown animal");
        }
    }
}
