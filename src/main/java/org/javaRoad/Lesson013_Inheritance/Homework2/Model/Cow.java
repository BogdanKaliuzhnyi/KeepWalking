package org.javaRoad.Lesson013_Inheritance.Homework2.Model;

public class Cow extends Animal {
    public static final String COW_CLASS_NAME = "Cow";
    private final String color;

    public Cow(String color) {
        super(COW_CLASS_NAME, "moo");
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void moo() {
        sound();
    }
}
