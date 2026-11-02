package org.javaRoad.lesson026_string_classes.task1;

import java.util.Scanner;

/**
 * Написать программу, которая принимает длину и ширину прямоугольника (2 целых числа).
 * Нарисовать в консоли заданный прямоугольник, используя “-“ и “|”.
 * Углы прямоугольника обозначить символом “ “.
 * Каждая единица длины должна обозначаться одним символом “-“,
 * каждая единица ширины – символом “|“.
 * <p>
 * Произвести декомпозицию по своему усмотрению. Рекомендую скинуть на проверку. Контакт ниже.
 */

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = requireInt(scanner, "Enter rectangle's length: ");
        int width = requireInt(scanner, "Enter rectangle's width: ");

        scanner.close();

        printRectangle(createRectangle(length, width));
    }

    static int requireInt(Scanner scanner, String requiringMessage) {
        System.out.print(requiringMessage);

        return scanner.nextInt();
    }

    static void printRectangle(StringBuilder rectangle) {
        System.out.print(rectangle);
    }

    static StringBuilder createRectangle(int length, int width) {
        String horizontalLine = createHorizontalLine(length);
        StringBuilder verticalLine = createVerticalLines(length, width);

        return new StringBuilder(horizontalLine + verticalLine + horizontalLine);
    }

    static String createHorizontalLine(int length) {
        return " " + "-".repeat(length) + "\n";
    }

    static StringBuilder createVerticalLines(int length, int width) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= width; i++) {
            sb.append("|").append(" ".repeat(length)).append("|\n");
        }
        return sb;
    }
}