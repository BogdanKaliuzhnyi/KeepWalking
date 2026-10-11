package org.javaRoad.Lesson016_AbstractClassesInterfaces.gemini.task2.game_classes;

import org.javaRoad.Lesson016_AbstractClassesInterfaces.gemini.task2.base.GameCharacter;

public class Warrior extends GameCharacter {
    public Warrior(String name) {
        super(name);
        this.health = 150;
    }

    @Override
    public void attack() {
        System.out.println(name + " атакует оружием!");
    }
}