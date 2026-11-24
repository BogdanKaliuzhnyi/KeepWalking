package org.javaRoad.lesson030_regex.task3.exception;

public class IncorrectWordException extends RuntimeException {
    public IncorrectWordException(String word) {
        super(word);
    }
}
