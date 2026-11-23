package org.javaRoad.lesson030_regex.task2.exception;

public class FullNameValidationException extends RuntimeException {
    public FullNameValidationException(String message) {
        super("Ошибка! "+ message);
    }
}
