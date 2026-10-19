package org.javaRoad.Lesson020_Exceptions.task3.exception;

public class UnknownAnimalException extends RuntimeException {
    public UnknownAnimalException(String message) {
        super(message);
    }
}
