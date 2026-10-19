package org.javaRoad.Lesson020_Exceptions.task3.model;

public class Dog extends Animal {
    private final String color;

    public Dog(String color) {
        super("woof");
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public void woof() {
        sound();
    }
}
