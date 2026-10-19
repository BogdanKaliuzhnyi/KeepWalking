package org.javaRoad.Lesson020_Exceptions.task3.model;

public class Cow extends Animal {
    private final String color;

    public Cow(String color) {
        super("moo");
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void moo() {
        sound();
    }
}
