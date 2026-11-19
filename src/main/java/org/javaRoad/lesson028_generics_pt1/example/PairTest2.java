package org.javaRoad.lesson028_generics_pt1.example;

import java.time.LocalDate;

/**
 * @author Сау Horstmann
 * @version 1.02 2015-06-21
 */
public class PairTest2 {
    public static void main(String[] args) {
        LocalDate[] birthdays = {
                LocalDate.of(1906, 12, 19), // G. Hopper
                LocalDate.of(1815, 12, 10), // A. Lovelace
                LocalDate.of(1903, 12, 3),  // J. von Neumann
                LocalDate.of(1910, 6, 2)    // K. Zuse
        };
        Pair<LocalDate> mm = ArrayAlg.minmax(birthdays);
        System.out.println("min = " + mm.getFirst());
        System.out.println("max = " + mm.getSecond());
    }

    class ArrayAlg {

        /**
         * Получает символьные строки с минимальным и максимальным значениями среди элементов массива
         *
         * @param a Массив символьных строк
         * @return Пара минимального и максимального значений или пустое значение, если параметр a имеет пустое значение
         */

        public static <T extends Comparable> Pair<T> minmax(T[] a) {
            if (a == null || a.length == 0) {
                return null;
            }

            T min = a[0];
            T max = a[0];

            for (int i = 1; i < a.length; i++) {
                if (min.compareTo(a[i]) > 0) {
                    min = a[i];
                }

                if (max.compareTo(a[i]) < 0) {
                    max = a[i];
                }
            }

            return new Pair<>(min, max);
        }
    }
}