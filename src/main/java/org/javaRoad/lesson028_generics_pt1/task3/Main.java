package org.javaRoad.lesson028_generics_pt1.task3;

import org.javaRoad.lesson028_generics_pt1.task3.model.ArrayValueFinder;

/**
 * <a href="https://github.com/KFalcon2022/lessons/blob/master/lessons/java-core/028/Generics.%20Part%20I.md"></a>
 * Реализовать класс для работы с массивом. Разработать метод, производящий поиск значения в массиве.
 * Если значение не найдено — выбрасывать исключение. Если найдено — возвращать его.
 */

public class Main {
    public static void main(String[] args) {
        ArrayValueFinder<Integer> integerArray = new ArrayValueFinder<>(new Integer[]{10, 15, 50});

        integerArray.print();
        Integer i1 = integerArray.find(10);
        System.out.println("i1 = " + i1);
        System.out.println();
        Integer i2 = integerArray.find(12);
        System.out.println("i2 = " + i2 + "\n");
        System.out.println();

        ArrayValueFinder<String> stringArray = new ArrayValueFinder<>(new String[]{"Hello", null, "Bye", "123"});
        stringArray.print();
        String s1 = stringArray.find(null);
        System.out.println("s1 = " + s1);
        System.out.println();
        String s2 = stringArray.find("12");
        System.out.println("s2 = " + s2);
        System.out.println();
        String s3 = stringArray.find("Hello");
        System.out.println("s3 = " + s3);
        System.out.println();
    }
}
