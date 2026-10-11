package org.javaRoad.Lesson2;

import java.util.Scanner;

public class homework2 {
    static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //conditions();
        //exercise1();
        //exercise2();
        exercise3();
    }

    static void exercise1() {
        System.out.print("Enter number a: ");
        float a = sc.nextFloat();
        System.out.print("Enter number b: ");
        float b = sc.nextFloat();
        float c = b * a * (a + b) / (a * a);
        System.out.println("\nc = ba(a + b)/(a2)");
        System.out.println(c);
        System.out.println((int) c);
    }

    static void exercise2() {
        System.out.print("Enter number a: ");
        int a = sc.nextInt();
        System.out.print("Enter number b: ");
        int b = sc.nextInt();
        int aCube = a * a * a;
        int bPow = b * b;
        System.out.println(aCube + " > " + bPow + " : " + (aCube > bPow));
    }

     static void exercise3() {
        int a = 1;
        int b = a++;
        b += a++;
        System.out.println(b); // 3
    }

    static void conditions() {
        String or = """
                        OR ||
                    |b=0| |b=1|     
                a=0 | 0 | | 1 |
                a=1 | 1 | | 1 |
                """;
        String xor = """
                        XOR ^^
                    |b=0| |b=1|     
                a=0 | 0 | | 1 |
                a=1 | 1 | | 0 |
                """;
        String and = """
                        AND &&
                    |b=0| |b=1|     
                a=0 | 0 | | 0 |
                a=1 | 0 | | 1 |
                """;

        System.out.println(or);
        System.out.println(xor);
        System.out.println(and);
    }
}
