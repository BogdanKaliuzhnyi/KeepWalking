package org.javaRoad.Lesson007_Varargs_Overloading_Recursion;

import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int factorial = calcFactorial(n);
        System.out.printf("Факториал числа %d равен %d", n, factorial);
    }

    static int calcFactorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * calcFactorial(n - 1);
    }
}
