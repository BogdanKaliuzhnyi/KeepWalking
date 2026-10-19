package org.javaRoad.Lesson017_Enum.task2.enums;

public enum Animal {
    CAT("Meow"),
    COW("Moo"),
    DOG("Woof");

    private final String sound;

    Animal(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }
}