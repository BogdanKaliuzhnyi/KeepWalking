package org.javaRoad.Lesson013_Inheritance.Homework2.Model;

public class Dog extends Animal {
    public static final String DOG_CLASS_NAME = "Dog";
    private final String color;

    public Dog(String color) {
        super(DOG_CLASS_NAME, "woof");
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public void woof() {
        sound();
    }
}
