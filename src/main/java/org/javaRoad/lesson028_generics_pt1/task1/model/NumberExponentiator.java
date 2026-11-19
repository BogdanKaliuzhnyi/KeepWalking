package org.javaRoad.lesson028_generics_pt1.task1.model;

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
