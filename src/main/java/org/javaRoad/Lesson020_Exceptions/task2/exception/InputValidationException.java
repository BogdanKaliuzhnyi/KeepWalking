package org.javaRoad.Lesson020_Exceptions.task2.exception;

public class InputValidationException extends RuntimeException {
    public InputValidationException(String message) {
        super(message);
    }
}
