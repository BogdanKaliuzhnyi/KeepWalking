package org.javaRoad.Lesson017_Enum.task3.enums;

public enum Figure {
    SQUARE("Square", 4) {
        @Override
        public String draw(int length) {
            StringBuilder sb = new StringBuilder();
            sb.append(SPACE_SYMBOL).append(LINE_SYMBOL.repeat(length * getLengthMultiplier()));
            for (int i = 0; i <= length; i++) {
                sb.append(NEWLINE).append(VERTICAL_LINE_SYMBOL)
                        .append(SPACE_SYMBOL.repeat(length * getLengthMultiplier()))
                        .append(VERTICAL_LINE_SYMBOL).append(SPACE_SYMBOL);
            }
            sb.append(NEWLINE).append(SPACE_SYMBOL).append(LINE_SYMBOL.repeat(length * getLengthMultiplier()));
            return sb.toString();
        }
    },
    TRIANGLE("Triangle", 2) {
        @Override
        public String draw(int length) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < length; i++) {
                sb.append(SPACE_SYMBOL.repeat(length - i)).append(SLASH_SYMBOL)
                        .append(SPACE_SYMBOL.repeat(i * getLengthMultiplier())).append(BACKSLASH_SYMBOL)
                        .append(NEWLINE);
            }
            sb.append(SPACE_SYMBOL).append(LINE_SYMBOL.repeat(length * getLengthMultiplier()));
            return sb.toString();
        }
    };
    private static final String LINE_SYMBOL = "-";
    private static final String VERTICAL_LINE_SYMBOL = "|";
    private static final String SLASH_SYMBOL = "/";
    private static final String BACKSLASH_SYMBOL = "\\";
    private static final String SPACE_SYMBOL = " ";
    private static final String NEWLINE = "\n";

    private final String alias;
    private final int lengthMultiplier;

    Figure(String alias, int lengthMultiplier) {
        this.alias = alias;
        this.lengthMultiplier = lengthMultiplier;
    }

    private String getAlias() {
        return alias;
    }

    public int getLengthMultiplier() {
        return lengthMultiplier;
    }

    public static Figure pickFigure(String input) {
        for (Figure f : values()) {
            if (f.getAlias().equalsIgnoreCase(input)) {
                return f;
            }
        }
        return null;
    }

    public abstract String draw(int length);
}
