package org.javaRoad.Lesson014_Polymorphism.exercise1;

public class Square extends EquilateralFigure {
    private final int LENGTH_MULTIPLIER = 4;

    @Override
    public void draw(int length) {
        System.out.println(SPACE_SYMBOL + LINE_SYMBOL.repeat(length * LENGTH_MULTIPLIER));
        for (int i = 0; i <= length; i++) {
            System.out.println(VERTICAL_LINE_SYMBOL + SPACE_SYMBOL.repeat(length * LENGTH_MULTIPLIER) +
                    VERTICAL_LINE_SYMBOL + SPACE_SYMBOL);
        }
        System.out.println(SPACE_SYMBOL + LINE_SYMBOL.repeat(length * LENGTH_MULTIPLIER));
    }
}
