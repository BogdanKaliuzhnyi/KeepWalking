package org.javaRoad.Lesson13_Inheritance.Homework2.Model;

public class Animal {
    private final String className;
    private final String sound;

    protected Animal(String className, String sound) {
        this.className = className;
        this.sound = sound;
    }

    public String getClassName() {
        return className;
    }

    protected void sound() {
        System.out.println(sound);
    }
}
