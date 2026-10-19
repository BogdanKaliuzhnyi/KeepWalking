package org.javaRoad.Lesson017_Enum.task1;

import java.util.Scanner;

import org.javaRoad.Lesson017_Enum.task1.enums.*;

public class Task2SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        Command answer = Command.findAnswer(scanner.nextLine());
        scanner.close();

        if (answer == null) {
            System.out.println("Unknown message");
        } else {
            System.out.println(answer.getAnswerMessage());
        }
    }
}