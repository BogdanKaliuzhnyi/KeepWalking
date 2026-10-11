package org.javaRoad.Lesson016_AbstractClassesInterfaces.gemini.task2.game_classes;

import org.javaRoad.Lesson016_AbstractClassesInterfaces.gemini.task2.base.GameCharacter;
import org.javaRoad.Lesson016_AbstractClassesInterfaces.gemini.task2.impl.Flyable;
import org.javaRoad.Lesson016_AbstractClassesInterfaces.gemini.task2.impl.Mage;

public class Dragon extends GameCharacter implements Flyable, Mage {
    public Dragon(String name) {
        super(name);
        health = 120;
    }

    @Override
    public void attack() {
        System.out.println(name + " атакует свою цель когтями");
    }

    @Override
    public void castSpell() {
        System.out.println(name + " изрыгает огонь из своей пасти");
    }

    @Override
    public void fly() {
        System.out.println(name + " взлетает над землей");
    }
}