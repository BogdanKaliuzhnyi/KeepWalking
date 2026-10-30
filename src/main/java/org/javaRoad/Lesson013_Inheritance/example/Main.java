package org.javaRoad.Lesson013_Inheritance.example;

public class Main {
    public static void main(String[] args) {
        FirstOne.whoIAm();
        SecondOne.whoIAm();

        System.out.println("New block <->\n\n");
        SecondOne mystery = new SecondOne();
        mystery.whoIAm();
        mystery.whoAmI();
    }
}
