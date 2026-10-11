package org.javaRoad.Lesson14_Polymorphism.exercise1;

public class Triangle extends EquilateralFigure {
    private final int LENGTH_MULTIPLIER = 2;

    @Override
    public void draw(int length) {
        for (int i = 0; i < length; i++) {
            System.out.println(SPACE_SYMBOL.repeat(length - i) + SLASH_SYMBOL +
                    SPACE_SYMBOL.repeat(i * LENGTH_MULTIPLIER) + BACKSLASH_SYMBOL);
        }
        System.out.println(SPACE_SYMBOL + LINE_SYMBOL.repeat(length * LENGTH_MULTIPLIER));
    }
}
