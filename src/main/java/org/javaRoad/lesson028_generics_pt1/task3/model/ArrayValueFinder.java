package org.javaRoad.lesson028_generics_pt1.task3.model;

import java.util.NoSuchElementException;

public class ArrayValueFinder<T> {
    private final T[] array;

    public ArrayValueFinder(T[] array) {
        this.array = array;
    }

    public T find(T value) {
        for (T t : array) {
            if (t == null && value == null) {
                return t;
            }

            if (t != null && t.equals(value)) {
                return t;
            }
        }
        throw new NoSuchElementException("Value not found");
    }

    public void print() {
        System.out.print("Array: ");
        for (T t : array) {
            System.out.print(t + " ");
        }
        System.out.println();
    }
}
