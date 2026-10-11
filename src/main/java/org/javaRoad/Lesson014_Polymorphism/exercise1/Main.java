package org.javaRoad.Lesson014_Polymorphism.exercise1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the type of figure: ");
        String figure = sc.nextLine();
        System.out.print("Enter the length of figure: ");
        int length = sc.nextInt();
        EquilateralFigure f;
        switch (figure) {
            case "square" -> f = new Square();
            case "triangle" -> f = new Triangle();
            default -> f = new EquilateralFigure();
        }
        f.draw(length);
    }
}
