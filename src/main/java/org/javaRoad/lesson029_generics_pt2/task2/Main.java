package org.javaRoad.lesson029_generics_pt2.task2;


import org.javaRoad.lesson029_generics_pt2.task2.model.NumberExponentiator;

public class Main {

    /**
     * <a href="https://github.com/KFalcon2022/lessons/blob/master/lessons/java-core/029/Generics.%20Part%20II.md">...</a>
     * Используя Задачу 1 из урока Generics. Часть I, реализуйте в Main метод, принимающий аргументом объект
     * подходящего для дженерика типа и возвращающий объект дженерика. Допустима параметризация только с
     * использованием wildcard.
     */

    public static void main(String[] args) {
        NumberExponentiator<Byte> byteExponentiator = new NumberExponentiator<>((byte) 3);
        NumberExponentiator<Short> shortExponentiator = new NumberExponentiator<>((short) 3);
        NumberExponentiator<Integer> intExponentiator = new NumberExponentiator<>(3);
        NumberExponentiator<Long> longExponentiator = new NumberExponentiator<>(3L);
        NumberExponentiator<Float> floatExponentiator = new NumberExponentiator<>(3f);
        NumberExponentiator<Double> doubleExponentiator = new NumberExponentiator<>(3d);

        printPowOf(byteExponentiator, 2);
        printPowOf(shortExponentiator, 3);
        printPowOf(intExponentiator, 4);
        printPowOf(longExponentiator, 5);
        printPowOf(floatExponentiator, 6);
        printPowOf(doubleExponentiator, 7);

        NumberExponentiator<?> exponentiatorWC = createNumberExponentiator((byte) 5);
        printPowOf(exponentiatorWC, 4);
        exponentiatorWC = createNumberExponentiator((short) 3);
        printPowOf(exponentiatorWC, 3);
        exponentiatorWC = createNumberExponentiator(3);
        printPowOf(exponentiatorWC, 2);
        exponentiatorWC = createNumberExponentiator(3L);
        printPowOf(exponentiatorWC, 3);
        exponentiatorWC = createNumberExponentiator(3f);
        printPowOf(exponentiatorWC, 3);
        exponentiatorWC = createNumberExponentiator(3d);
        printPowOf(exponentiatorWC, 1);
    }


    private static <T extends Number> NumberExponentiator<?> createNumberExponentiator(T value) {
        return new NumberExponentiator<>(value);
    }

    private static void printPowOf(NumberExponentiator<?> number, int power) {
        System.out.print("For number " + number.getNumber());
        System.out.printf(" pow of %d is %.2f%n", power, number.exponentiate(power));
    }
}
