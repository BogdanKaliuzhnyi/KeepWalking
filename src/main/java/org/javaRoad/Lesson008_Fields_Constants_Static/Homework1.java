package org.javaRoad.Lesson008_Fields_Constants_Static;

import java.util.Scanner;

public class Homework1 {
    static final Scanner input = new Scanner(System.in);
    static final String HORIZONTAL_LINE = "==";
    static final String VERTICAL_LINE = "||";
    static final String WHITESPACE = "  ";
    static final String NEWLINE = "\n";

    public static void main(String[] args) {
        int length = requireInt(input, "Enter rectangle's length: ");
        int width = requireInt(input, "Enter rectangle's width: ");

        String horizontalLine = createHorizontalLine(length);
        String verticalLines = createVerticalLines(length, width);

        printRectangle(horizontalLine, verticalLines);
    }

    static int requireInt(Scanner scanner, String requiringMessage) {
        System.out.print(requiringMessage);

        return scanner.nextInt();
    }

    static void printRectangle(String horizontalLine, String verticalLines) {
        System.out.print(horizontalLine + verticalLines + horizontalLine);
    }

    static String createHorizontalLine(int length) {
        String horizontalLine = WHITESPACE;

        for (int i = 0; i < length; i++) {
            horizontalLine += HORIZONTAL_LINE;
        }

        horizontalLine += NEWLINE;

        return horizontalLine;
    }

    static String createVerticalLines(int length, int width) {
        String verticalLinesUnit = getVerticalLinesUnit(length);

        String verticalLines = "";

        for (int i = 0; i < width; i++) {
            verticalLines += verticalLinesUnit;
        }
        return verticalLines;
    }

    static String getVerticalLinesUnit(int length) {
        String verticalLinesUnit = VERTICAL_LINE;

        for (int i = 0; i < length; i++) {
            verticalLinesUnit += WHITESPACE;
        }

        verticalLinesUnit += VERTICAL_LINE + NEWLINE;
        return verticalLinesUnit;
    }
}
