package org.javaRoad.Lesson013_Inheritance.example2_objectCasting;

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

    @Override
    public void sound() {
        System.out.println(color + " корова сказала moo");
    }
}
