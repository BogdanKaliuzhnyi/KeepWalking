package org.javaRoad.Lesson13_Inheritance.Homework1;

public class Cat extends Animal {
    private String color;

    private Cat() {
        System.out.println("I'm a cat");
    }

    public Cat(String color) {
        this();
        this.color = color;
    }
}
