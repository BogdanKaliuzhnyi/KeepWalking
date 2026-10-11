package org.javaRoad.Lesson3;

import java.util.Scanner;

public class homework3 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //exercise1();
        //exercise2_1();
        //exercise2_2();
//        exercise3_1();
//        exercise3_2();
        exercise4();
    }

    static void exercise1() {
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();

        if (a == b) {
            System.out.println("Your numbers are equal!");
        }

        if (a % 2 == 0) {
            System.out.println("a is even so result is a * b = " + a * b);
            return;
        }

        System.out.printf("a is odd so result is a / b = %.3f", (double) a / b);
    }

    static void exercise2_1() {
        System.out.print("Enter message: ");
        String input = sc.nextLine();
        if (input.equals("Hi")) {
            System.out.println("Hello!");
        } else if (input.equals("Bye")) {
            System.out.println("Goodbye!");
        } else if (input.equals("How are you")) {
            System.out.println("How are you doing?");
        } else {
            System.out.println("Unknown message");
        }
    }

    static void exercise2_2() {
        System.out.print("Enter message: ");
        String input = sc.nextLine();
        switch (input) {
            case "Hi" -> System.out.println("Hello!");
            case "Bye" -> System.out.println("Bye!");
            case "How are you" -> System.out.println("How are you doing?");
            default -> System.out.println("Unknown message");
        }
    }

    static void exercise3_1() {
        System.out.print("Enter your first name: ");
        String firstName = sc.nextLine();
        System.out.print("Enter your last name: ");
        String lastName = sc.nextLine();
        System.out.print("Enter your patronymic: ");
        String patronymic = sc.nextLine();

        System.out.println("Your full name is: " + firstName + " " + lastName + " " + patronymic);
    }

    static void exercise3_2() {
        System.out.print("Enter your first name: ");
        String firstName = sc.nextLine();
        System.out.print("Enter your last name: ");
        String lastName = sc.nextLine();
        System.out.print("Enter your patronymic: ");
        String patronymic = sc.nextLine();

        System.out.printf("Your full name is: %s %s %s", firstName, lastName, patronymic);
    }

    static void exercise4() {
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();

        if (a % 2 == 0 ^ b % 3 == 0) {
            System.out.println("A " + (a > b ? "больше " : (a == b ? "равно " : "меньше ")) + " B");
            return;
        }

        if (a % 2 == 0 && a % 3 == 0) {
            double pow = Math.pow(a, b);
            if (pow > Integer.MAX_VALUE || pow < Integer.MIN_VALUE) {
                System.out.println("Результат выражения слишком большой!");
                return;
            }
            System.out.println("Число a кратно 2 и 3: " + pow);
        }
    }
}
