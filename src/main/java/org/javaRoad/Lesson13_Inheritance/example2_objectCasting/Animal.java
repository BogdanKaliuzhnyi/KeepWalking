package org.javaRoad.Lesson13_Inheritance.example2_objectCasting;

public class Animal {
    private final String className;
    final String color = "Colorless";
    private final String sound;

    protected Animal(String className, String sound) {
        this.className = className;
        this.sound = sound;
    }

    public String getClassName() {
        return className;
    }

    public String getColor(boolean abc) {
        return color;
    }

    protected void sound() {
        System.out.println("sound nothing");
    }
}
