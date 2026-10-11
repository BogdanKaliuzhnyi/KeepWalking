package org.javaRoad.Lesson016_AbstractClassesInterfaces.gemini.task2.base;

public abstract class GameCharacter {
    protected String name;
    protected int health;

    public GameCharacter(String name) {
        this.name = name;
    }

    abstract public void attack();
}
