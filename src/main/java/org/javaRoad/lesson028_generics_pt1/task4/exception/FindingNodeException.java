package org.javaRoad.lesson028_generics_pt1.task4.exception;

public class FindingNodeException extends RuntimeException {
    public FindingNodeException(String message) {
        super("Value \"" + message +  "\" not found");
    }
}
