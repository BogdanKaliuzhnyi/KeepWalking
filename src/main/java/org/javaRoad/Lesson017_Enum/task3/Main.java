package org.javaRoad.Lesson017_Enum.task3;

import org.javaRoad.Lesson017_Enum.task3.enums.Figure;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the type of figure: ");
        Figure figure = Figure.pickFigure(sc.nextLine());
        System.out.print("Enter the length of figure: ");
        int length = sc.nextInt();

        if (figure == null) {
            System.out.println("Unknown figure");
            return;
        }

        System.out.println(figure.draw(length));
    }
}
