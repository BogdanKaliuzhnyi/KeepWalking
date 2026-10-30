package org.javaRoad.Lesson022_WrappedClasses;

public class Main {
    public static void main(String[] args) {
        Double d1 = 2.53; // автоупаковка
        Double d2 = 2.4;  // автоупаковка
        double d3 = Double.parseDouble("5.53");
        int primitive = Integer.valueOf("5"); // автораспаковка
        Integer i1 = Integer.valueOf(7);
        short sh = i1.shortValue(); // явное получение примитивного значения

        System.out.println(Double.valueOf(-0.0).equals(Double.valueOf(0.0))); // false
        System.out.println(Double.valueOf(9.999998).equals(Double.valueOf(9.999999)));// false
        System.out.println(Double.valueOf("NaN").equals(Double.valueOf("NaN"))); // true
        System.out.println(Double.valueOf("Infinity").equals(Double.valueOf("Infinity"))); // true

        System.out.println(Integer.valueOf(10).equals(Integer.valueOf(20)));// false

        Runtime runtime = Runtime.getRuntime();
        System.out.println("total: " + runtime.totalMemory());
        System.out.println("free: " + runtime.freeMemory());
        System.out.println("total - free: " + (runtime.totalMemory() - runtime.freeMemory()));
    }
}
