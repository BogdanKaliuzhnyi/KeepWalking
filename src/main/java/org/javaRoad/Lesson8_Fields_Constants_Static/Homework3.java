package org.javaRoad.Lesson8_Fields_Constants_Static;

import java.util.Arrays;
import java.util.Scanner;

public class Homework3 {
    final static Scanner INPUT = new Scanner(System.in);
    final static int[] PRIME_NUMBERS = new int[10];

    public static void main(String[] args) {

        PrimeNumber.getPrimeNumbers(PRIME_NUMBERS);
        System.out.println(Arrays.toString(PRIME_NUMBERS));
        System.out.println(PrimeNumber.sum(PRIME_NUMBERS) + '\n');
        getFirstPrimeNumber();

    }

    static void getFirstPrimeNumber() {
        System.out.println("Enter amount of the first prime numbers to get their sum: ");
        int numbersAmount = INPUT.nextInt();
        if (numbersAmount < 0 || numbersAmount > PRIME_NUMBERS.length) {
            System.out.println("Invalid input, enter a number between 0 and " + (PRIME_NUMBERS.length - 1));
            return;
        }
        System.out.println(PrimeNumber.getSumOfFirst(PRIME_NUMBERS, numbersAmount));
    }
}