package org.javaRoad.Lesson016_AbstractClassesInterfaces.task2;

import org.javaRoad.Lesson016_AbstractClassesInterfaces.task2.answer.Answer;
import org.javaRoad.Lesson016_AbstractClassesInterfaces.task2.answer.impl.*;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine().toLowerCase();
        sc.close();

        Answer answer;
        switch (s) {
            case "hi":
                answer = new HiAnswer();
                break;
            case "bye":
                answer = new ByeAnswer();
                break;
            case "how are you?":
                answer = new HowAreYouAnswer();
                break;
            default:
                answer = new UnknownAnswer();
        }

        System.out.println(answer.getAnswer());
    }
}