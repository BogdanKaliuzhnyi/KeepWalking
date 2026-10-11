package org.javaRoad.Lesson013_Inheritance.Homework1;

public class Dog extends Animal {
    private String color;

    private Dog() {
        System.out.println("I'm a Dog");
    }

    public Dog(String color) {
        this();
        this.color = color;
    }
}
