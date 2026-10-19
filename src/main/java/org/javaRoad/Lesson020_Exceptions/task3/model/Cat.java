package org.javaRoad.Lesson020_Exceptions.task3.model;

public class Cat extends Animal {
    private final String color;

    public Cat(String color) {
        super("meow");
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public void meow(){
        sound();
    }
}
