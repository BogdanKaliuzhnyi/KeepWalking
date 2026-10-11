package org.javaRoad.Lesson014_Polymorphism.exercise1;

public class EquilateralFigure {
    public final String LINE_SYMBOL = "-";
    public final String VERTICAL_LINE_SYMBOL = "|";
    public final String SLASH_SYMBOL = "/";
    public final String BACKSLASH_SYMBOL = "\\";
    public final String SPACE_SYMBOL = " ";

    protected void draw(int length) {
        System.out.println("Can't draw this figure");
    }
}
