package org.javaRoad.lesson025_inner_classes.task2.variant1_anonymous_classes;

import org.javaRoad.lesson025_inner_classes.task2.variant1_anonymous_classes.model.Animal;

import java.util.Random;

public class Main {
    private static final Random random = new Random();

    public static void main(String[] args) {
        Animal[] animals = fillAnimalArray(new Animal[5]);
        soundAll(animals);
    }

    private static Animal[] fillAnimalArray(Animal[] animals) {
        for (int i = 0; i < animals.length; i++) {
            switch (random.nextInt(3)) {
                case 0 -> animals[i] = new Animal() {
                    @Override
                    public void sound() {
                        System.out.println("Meow");
                    }
                };
                case 1 -> animals[i] = new Animal() {
                    @Override
                    public void sound() {
                        System.out.println("Moo");
                    }
                };
                case 2 -> animals[i] = new Animal() {
                    @Override
                    public void sound() {
                        System.out.println("Bark");
                    }
                };
            }
        }
        return animals;
    }

    private static void soundAll(Animal[] animals) {
        for (Animal animal : animals) {
            animal.sound();
        }
    }
}
