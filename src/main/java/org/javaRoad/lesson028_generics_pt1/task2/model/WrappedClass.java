package org.javaRoad.lesson028_generics_pt1.task2.model;

public class WrappedClass<T> {
    private final T value;

    public WrappedClass(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public boolean isNull() {
        return value == null;
    }
}
