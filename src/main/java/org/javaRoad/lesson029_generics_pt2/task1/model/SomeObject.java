package org.javaRoad.lesson029_generics_pt2.task1.model;

public class SomeObject<T> {
    private final T value;

    public SomeObject(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
