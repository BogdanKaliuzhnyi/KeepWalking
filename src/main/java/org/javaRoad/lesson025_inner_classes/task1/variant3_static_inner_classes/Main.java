package org.javaRoad.lesson025_inner_classes.task1.variant3_static_inner_classes;

import org.javaRoad.lesson025_inner_classes.task1.variant3_static_inner_classes.model.Figure;

import java.util.Scanner;

/**
 * Реализуйте задачу
 * <a href="https://github.com/KFalcon2022/practical-tasks/tree/master/src/com/walking/lesson16_abstract_class_interface/task1">...</a>
 * Используя вложенные статические классы.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter shape's length: ");
        int length = scanner.nextInt();

        System.out.print("Enter shape's type:\n 1: Square\n 2: Triangle\n");
        int shapeType = scanner.nextInt();

        scanner.close();

        System.out.println(createShapeString(length, shapeType));
    }

    private static String createShapeString(int length, int type) {
        if (length < 1 || type != 1 && type != 2) {
            return "Incorrect input.";
        }
        if (type == 1) {
            return Figure.Square.createShapeString(length);
        }
            return Figure.Triangle.createShapeString(length);
    }
}