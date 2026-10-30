package org.javaRoad.lesson025_inner_classes.task1.variant2_inner_classes.model;

public class Figures {
    static final char NEW_LINE_SYMBOL = '\n';
    static final String SINGLE_SPACE_ELEMENT = " ";
    static final String TRIPLE_SPACE_ELEMENT = "   ";

    private final int length;

    public Figures(int length) {
        if (length < 1) {
            throw new IllegalArgumentException("Length must be greater than 0");
        }
        this.length = length;
    }

    public class Triangle {
        static final String TRIANGLE_LEFT_SIDE_ELEMENT = "/";
        static final String TRIANGLE_RIGHT_SIDE_ELEMENT = "\\";
        static final String TRIANGLE_HORIZONTAL_SIDE_ELEMENT = "--";

        public String createShapeString() {

            String triangle = "";
            for (int i = 0; i < length; i++) {

                for (int j = 0; j < length - i; j++) {
                    triangle += SINGLE_SPACE_ELEMENT;
                }

                triangle += TRIANGLE_LEFT_SIDE_ELEMENT;

                for (int j = 0; j < i * 2; j++) {
                    triangle += SINGLE_SPACE_ELEMENT;
                }

                triangle += TRIANGLE_RIGHT_SIDE_ELEMENT + NEW_LINE_SYMBOL;
            }

            triangle += " ";
            for (int i = 0; i < length; i++) {
                triangle += TRIANGLE_HORIZONTAL_SIDE_ELEMENT;
            }

            return triangle;
        }
    }

    public class Square {
        static final String SQUARE_VERTICAL_ELEMENT = "|";
        static final String SQUARE_HORIZONTAL_SIDE_ELEMENT = "---";

        public String createShapeString() {
            String horizontalLine = createHorizontalLine(length);
            String verticalLines = createVerticalLines(length);

            return horizontalLine + verticalLines + horizontalLine;
        }

        private String createHorizontalLine(int length) {
            String horizontalLine = SINGLE_SPACE_ELEMENT;

            for (int i = 0; i < length; i++) {
                horizontalLine += SQUARE_HORIZONTAL_SIDE_ELEMENT;
            }

            horizontalLine += TRIPLE_SPACE_ELEMENT + NEW_LINE_SYMBOL;

            return horizontalLine;
        }

        private String createVerticalLines(int length) {
            String verticalLinesUnit = getVerticalLinesUnit(length);
            String verticalLines = "";

            for (int i = 0; i < length; i++) {
                verticalLines += verticalLinesUnit;
            }

            return verticalLines;
        }

        private String getVerticalLinesUnit(int length) {
            String verticalLinesUnit = SQUARE_VERTICAL_ELEMENT;

            for (int i = 0; i < length; i++) {
                verticalLinesUnit += TRIPLE_SPACE_ELEMENT;
            }

            verticalLinesUnit += SQUARE_VERTICAL_ELEMENT + NEW_LINE_SYMBOL;

            return verticalLinesUnit;
        }
    }
}

