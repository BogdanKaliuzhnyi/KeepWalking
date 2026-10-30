package org.javaRoad.lesson025_inner_classes.task1.variant3_static_inner_classes.model;

public class Figure {
    private static final char NEW_LINE_SYMBOL = '\n';
    private static final String SINGLE_SPACE_ELEMENT = " ";
    private static final String TRIPLE_SPACE_ELEMENT = "   ";

    private Figure(){}

    public static class Triangle {
        private static final String TRIANGLE_LEFT_SIDE_ELEMENT = "/";
        private static final String TRIANGLE_RIGHT_SIDE_ELEMENT = "\\";
        private static final String TRIANGLE_HORIZONTAL_SIDE_ELEMENT = "--";

        public static String createShapeString(int length) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < length; i++) {
                sb.append(SINGLE_SPACE_ELEMENT.repeat(length - i));
                sb.append(TRIANGLE_LEFT_SIDE_ELEMENT);
                sb.append(SINGLE_SPACE_ELEMENT.repeat(i * 2));
                sb.append(TRIANGLE_RIGHT_SIDE_ELEMENT).append(NEW_LINE_SYMBOL);
            }

            sb.append(SINGLE_SPACE_ELEMENT);
            sb.append(TRIANGLE_HORIZONTAL_SIDE_ELEMENT.repeat(Math.max(0,length)));

            return sb.toString();
        }
    }

    public static class Square {
        private static final String SQUARE_VERTICAL_ELEMENT = "|";
        private static final String SQUARE_HORIZONTAL_SIDE_ELEMENT = "---";

        public static String createShapeString(int length) {
            String horizontalLine = createHorizontalLine(length);
            String verticalLines = createVerticalLines(length);

            return horizontalLine + verticalLines + horizontalLine;
        }

        private static String createHorizontalLine(int length) {
            return SINGLE_SPACE_ELEMENT + SQUARE_HORIZONTAL_SIDE_ELEMENT.repeat(length) + NEW_LINE_SYMBOL;
        }

        private static String createVerticalLines(int length) {
            String verticalLinesUnit = getVerticalLinesUnit(length);

            return verticalLinesUnit.repeat(length);
        }

        private static String getVerticalLinesUnit(int length) {
            return SQUARE_VERTICAL_ELEMENT + TRIPLE_SPACE_ELEMENT.repeat(length) +
                    SQUARE_VERTICAL_ELEMENT + NEW_LINE_SYMBOL;
        }
    }
}