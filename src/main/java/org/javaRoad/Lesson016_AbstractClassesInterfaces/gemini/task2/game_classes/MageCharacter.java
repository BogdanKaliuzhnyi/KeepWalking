package org.javaRoad.Lesson016_AbstractClassesInterfaces.gemini.task2.game_classes;

import org.javaRoad.Lesson016_AbstractClassesInterfaces.gemini.task2.base.GameCharacter;
import org.javaRoad.Lesson016_AbstractClassesInterfaces.gemini.task2.impl.Mage;

public class MageCharacter extends GameCharacter implements Mage {
    public MageCharacter(String name) {
        super(name);
        health = 70;
    }

    @Override
    public void attack() {
        System.out.println(name + " бьет посохом");
    }

    @Override
    public void castSpell() {
        System.out.println(name + " сотворяет огненную глыбу из своих рук!");
    }
}