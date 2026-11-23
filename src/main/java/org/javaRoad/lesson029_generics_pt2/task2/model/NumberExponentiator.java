package org.javaRoad.lesson029_generics_pt2.task2.model;

public class NumberExponentiator<T extends Number> {
    private final T number;

    public NumberExponentiator(T number) {
        this.number = number;
    }

    public double exponentiate(double exponent) {
        return Math.pow(number.doubleValue(), exponent);
    }

    public T getNumber() {
        return number;
    }
}
