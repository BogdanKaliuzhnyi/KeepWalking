package org.javaRoad.Lesson007_Varargs_Overloading_Recursion;

public class SummOverloader {
    public static void main(String[] args) {

    }

    boolean sum(boolean a, boolean b) {
        return a && b;
    }

    String sum(char a, char b) {
        return "" + a + b;
    }

    short sum(short a, short b) {
        return (short) (a + b);
    }

    float sum(float a, float b) {
        return (a + b);
    }

    int sum(int a, int b) {
        return (a + b);
    }

    long sum(long a, long b) {
        return (a + b);
    }

    double sum(double a, double b) {
        return (a + b);
    }

}
