package org.javaRoad.Lesson018_CheckTypes.task.Model;

public class Animal {
    private final String sound;

    protected Animal(String sound) {
        this.sound = sound;
    }

    protected void sound() {
        System.out.println(sound);
    }
}
