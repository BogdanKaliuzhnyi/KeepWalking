package org.javaRoad.Lesson020_Exceptions.task2;

import org.javaRoad.Lesson020_Exceptions.task2.exception.InputValidationException;
import org.javaRoad.Lesson020_Exceptions.task2.model.EquilateralTriangle;
import org.javaRoad.Lesson020_Exceptions.task2.model.Square;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter shape's length: ");
            int length = parseInt(scanner.nextLine());
            System.out.print("Enter shape's type:\n 1: Square\n 2: Triangle\n");
            int shapeType = parseInt(scanner.nextLine());
            checkInput(length, shapeType);
            System.out.println(createShapeString(length, shapeType));
        } catch (InputValidationException e) {
            System.out.println(e.getMessage());
        }

    }

    public static int parseInt(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new InputValidationException("Enter an integer");
        }
    }

    public static void checkInput(int length, int shapeType) {
        if (length < 1 || length > 10) {
            throw new InputValidationException("Length must be between 1 and 10");
        }
        if (shapeType != 1 && shapeType != 2) {
            throw new InputValidationException("Shape type must be either 1 or 2");
        }
    }

    private static String createShapeString(int length, int type) {
        if (type == 1) {
            return new Square(length).createShapeString();
        } else {
            return new EquilateralTriangle(length).createShapeString();
        }
    }
}