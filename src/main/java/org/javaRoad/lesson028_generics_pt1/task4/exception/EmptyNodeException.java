package org.javaRoad.lesson028_generics_pt1.task4.exception;

public class EmptyNodeException extends RuntimeException {
    public EmptyNodeException() {
      super("Deleting null element failed");
    }
}
