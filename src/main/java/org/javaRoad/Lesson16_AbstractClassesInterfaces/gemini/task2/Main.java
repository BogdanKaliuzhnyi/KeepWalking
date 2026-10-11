package org.javaRoad.Lesson16_AbstractClassesInterfaces.gemini.task2;

import org.javaRoad.Lesson16_AbstractClassesInterfaces.gemini.task2.base.GameCharacter;
import org.javaRoad.Lesson16_AbstractClassesInterfaces.gemini.task2.game_classes.Dragon;
import org.javaRoad.Lesson16_AbstractClassesInterfaces.gemini.task2.game_classes.MageCharacter;
import org.javaRoad.Lesson16_AbstractClassesInterfaces.gemini.task2.game_classes.Warrior;
import org.javaRoad.Lesson16_AbstractClassesInterfaces.gemini.task2.impl.Mage;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("Орк");
        MageCharacter mage = new MageCharacter("Зельда");
        Dragon dragon = new Dragon("Драго");

        List<GameCharacter> characters = new ArrayList<>();
        characters.add(warrior);
        characters.add(mage);
        characters.add(dragon);

        for (GameCharacter character : characters) {
            character.attack();

            if (character instanceof MageCharacter) {
                ((MageCharacter) character).castSpell();
            }

            if (character instanceof Dragon) {
                ((Dragon) character).fly();
            }
        }
    }
}