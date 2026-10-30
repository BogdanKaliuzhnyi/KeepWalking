package org.javaRoad.lesson025_inner_classes.task1.variant1_anonymous_classes.model;

public abstract class Figure {
    public static final char NEW_LINE_SYMBOL = '\n';
    public static final String SINGLE_SPACE_ELEMENT = " ";
    public static final String TRIPLE_SPACE_ELEMENT = "   ";
    public static final String TRIANGLE_LEFT_SIDE_ELEMENT = "/";
    public static final String TRIANGLE_RIGHT_SIDE_ELEMENT = "\\";
    public static final String TRIANGLE_HORIZONTAL_SIDE_ELEMENT = "--";
    public static final String SQUARE_VERTICAL_ELEMENT = "|";
    public static final String SQUARE_HORIZONTAL_SIDE_ELEMENT = "---";

    private final int length;

    public Figure(int length) {
        this.length = length;
    }

    public abstract String drawShape();

    public int getLength() {
        return length;
    }
}
