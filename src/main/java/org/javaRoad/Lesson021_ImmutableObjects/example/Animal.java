package org.javaRoad.Lesson021_ImmutableObjects.example;

public final class Animal {
    private final String name;
    Animal(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
