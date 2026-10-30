package org.javaRoad.lesson025_inner_classes.task1.variant1_anonymous_classes;

import org.javaRoad.lesson025_inner_classes.task1.variant1_anonymous_classes.model.Figure;

import java.util.Scanner;

/**
 * Реализуйте задачу
 * <a href="https://github.com/KFalcon2022/practical-tasks/tree/master/src/com/walking/lesson16_abstract_class_interface/task1">...</a>
 * Используя анонимные классы.
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
        if (type == 1) {
            Figure square = new Figure(length) {

                @Override
                public String drawShape() {
                    String horizontalLine = createHorizontalLine(getLength());
                    String verticalLines = createVerticalLines(getLength());

                    return horizontalLine + verticalLines + horizontalLine;
                }

                private String createHorizontalLine(int length) {
                    return SINGLE_SPACE_ELEMENT + SQUARE_HORIZONTAL_SIDE_ELEMENT.repeat(Math.max(0, length)) +
                            NEW_LINE_SYMBOL;
                }

                private String createVerticalLines(int length) {
                    String verticalLinesUnit = getVerticalLinesUnit(length);

                    return verticalLinesUnit.repeat(length);
                }

                private String getVerticalLinesUnit(int length) {
                    return SQUARE_VERTICAL_ELEMENT + TRIPLE_SPACE_ELEMENT.repeat((length)) +
                            SQUARE_VERTICAL_ELEMENT + NEW_LINE_SYMBOL;
                }
            };

            return square.drawShape();
        }

        if (type == 2) {
            Figure triangle = new Figure(length) {
                @Override
                public String drawShape() {
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < getLength(); i++) {
                        sb.append(SINGLE_SPACE_ELEMENT.repeat(getLength() - i));
                        sb.append(TRIANGLE_LEFT_SIDE_ELEMENT);
                        sb.append(SINGLE_SPACE_ELEMENT.repeat(Math.max(0, i * 2)));
                        sb.append(TRIANGLE_RIGHT_SIDE_ELEMENT).append(NEW_LINE_SYMBOL);
                    }

                    sb.append(SINGLE_SPACE_ELEMENT);
                    sb.append(TRIANGLE_HORIZONTAL_SIDE_ELEMENT.repeat(Math.max(0, getLength())));

                    return sb.toString();
                }
            };
            return triangle.drawShape();
        }

        return "Incorrect input.";
    }
}