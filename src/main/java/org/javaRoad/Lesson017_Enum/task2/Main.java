package org.javaRoad.Lesson017_Enum.task2;

import org.javaRoad.Lesson017_Enum.task2.enums.Animal;

public class Main {
    public static void main(String[] args) {
        for (Animal animal : Animal.values()) {
            System.out.println(animal.getSound());
        }
    }
}