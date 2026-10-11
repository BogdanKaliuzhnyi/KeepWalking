package org.javaRoad.Lesson7_Varargs_Overloading_Recursion;

import java.util.Scanner;

public class Roots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 1) {
            System.out.println("Вводимое число должно быть >= 1");
        }
        System.out.println(extractRoots(1, n));
    }

    static double extractRoots(double n, double  maxNumber) {
        if (n == maxNumber) {
            return Math.sqrt(maxNumber);
        }
        return Math.sqrt(n + extractRoots(n + 1, maxNumber));
    }
}
