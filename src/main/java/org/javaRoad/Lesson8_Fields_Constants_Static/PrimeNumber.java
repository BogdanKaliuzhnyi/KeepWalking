package org.javaRoad.Lesson8_Fields_Constants_Static;

public class PrimeNumber {

    public static void getPrimeNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                array[i] = 2;
            } else {
                int addingValue = i == 1 ? 1 : 2;
                int number = array[i - 1] + addingValue;
                array[i] = findNextPrimeNumber(number, array, i);
            }
        }
    }

/**    public static void getPrimeNumbers(int[] array, int number, int end) {
        for (int i = 0; i < array.length; i++) {
            if (number % 2 == 0) {
                number++;
            }
            if (i == 0) {
                array[i] = findNextPrimeNumber(number, array, i);
            } else {
                number = array[i - 1] + 2;
            }

            int maxNumber = findNextPrimeNumber(number, array, i);
            if (maxNumber >= end) {
                return;
            }
            array[i] = findNextPrimeNumber(number, array, i);
        }
    }
 **/
    //    В данном случае, рекурсивно реализован вызов проверки для нового числа в рамках
//    заполнения одного элемента массива
    static int findNextPrimeNumber(int number, int[] primeNumbers, int currentIndex) {
        boolean isPrime = isPrime(number, primeNumbers, currentIndex);

        if (isPrime) {
            return number;
        }

        number += 2;

        return findNextPrimeNumber(number, primeNumbers, currentIndex);
    }

    //    Метод проверки конкретного числа на то, является ли оно простым
    static boolean isPrime(int number, int[] primeNumbers, int currentIndex) {
        int j = 0;
        boolean isPrime = true;

        while (isPrime && j < currentIndex && number / primeNumbers[j] > 1) {
            if (number % primeNumbers[j] == 0) {
                isPrime = false;
            } else {
                j++;
            }
        }
        return isPrime;
    }

    //    Логика реализации удобного метода-обертки, по аналогии с предыдущей задачей
    static int sum(int[] numbers) {
        return sum(numbers, 0);
    }

    static int sum(int[] numbers, int i) {
        if (i == numbers.length - 1) {
            return numbers[i];
        }

        return numbers[i] + sum(numbers, i + 1);
    }

    static int getSumOfFirst(int[] numbers, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += numbers[i];
        }
        return sum;
    }
}