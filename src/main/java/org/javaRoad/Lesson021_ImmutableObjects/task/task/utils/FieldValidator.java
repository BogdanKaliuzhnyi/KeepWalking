package org.javaRoad.Lesson021_ImmutableObjects.task.task.utils;

public final class FieldValidator {
    private FieldValidator() {}
    public static String validateField(String value, String field) {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException("Field " + field + " is null or empty");
        }
        return value;
    }
}
