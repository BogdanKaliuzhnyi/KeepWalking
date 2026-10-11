package org.javaRoad.Lesson1;

public class homework1 {
    public static void main(String[] args) {
        if (3/2 > 1) {
            System.out.println("сработало)");
        }
        System.out.println(3/2);
//        exercise1();
//        exercise1_1();
//        exercise1_2_1();
//        exercise1_2_2();
    }

    static void exercise1() {
        int a = 5;
        int b = 10;
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Способ с использованием 3-й переменной:");
        System.out.println("Значение а: " + a + ". Значение b: " + b);
    }

    static void exercise1_1() {
        int a = 5;
        int b = 10;

        a += b;
        b = a - b;
        a -= b;
        System.out.println("Арифметический способ:");
        System.out.println("Значение а: " + a + ". Значение b: " + b);
    }

    static void exercise1_2_1() {
        int a = 5; //   0101
        int b = 10; //  1010

        a = a ^ b;
        System.out.println("a = 0101 ^ 1010 = 1111 (15)");
        b = a ^ b;
        System.out.println("b = 1111 ^ 1010 = 0101 (5)");
        a = a ^ b;
        System.out.println("a = 1111 ^ 0101 = 1010 (10)");

        System.out.println("Побитовый способ:");
        System.out.println("Значение а: " + a + ". Значение b: " + b);
    }

    static void exercise1_2_2() {
        int a = 3; //   0011
        int b = 13; //  1101

        a = a ^ b;
        System.out.println("a = 0011 ^ 1101 = 1110 (14)");
        b = a ^ b;
        System.out.println("b = 1110 ^ 1101 = 0011 (3)");
        a = a ^ b;
        System.out.println("a = 1110 ^ 0011 = 1101 (13)");

        System.out.println("Побитовый способ:");
        System.out.println("Значение а: " + a + ". Значение b: " + b);
    }
}
