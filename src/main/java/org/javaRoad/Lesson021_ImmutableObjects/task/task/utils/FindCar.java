package org.javaRoad.Lesson021_ImmutableObjects.task.task.utils;

import org.javaRoad.Lesson021_ImmutableObjects.task.task.model.Car;

public class FindCar {
    public static void doResearch(Car[] carArray, Car wanted) {
        printReport(carArray, wanted);
        compareCars(carArray, wanted);
    }

    private static void printCarArray(Car[] carArray) {
        for (int i = 0; i < carArray.length; i++) {
            if (carArray[i] == null) {
                return;
            }
            System.out.println("Car #" + (i + 1) + ": ");
            System.out.println(carArray[i].toString());
        }
    }

    private static void printReport(Car[] carArray, Car wanted) {
        System.out.println("Разыскиваемая машина:");
        System.out.println(wanted);
        System.out.println("Список автомобилей:\n");
        printCarArray(carArray);
    }

    private static void compareCars(Car[] carArray, Car wanted) {
        int found = 0;
        for (int i = 0; i < carArray.length; i++) {
            if (carArray[i].identifier.hashCode() == wanted.identifier.hashCode()
                    && carArray[i].identifier.equals(wanted.identifier)) {
                System.out.println("Внимание!!!\nНайден автомобиль по ориентировке:");
                System.out.println("Car #" + (i + 1) + ": " + carArray[i].toString());
                found++;
            }
        }

        if (found == 1) {
            return;
        }

        if (found > 1) {
            System.out.println("Требуется дополнительная проверка среди этих " + found + " автомобилей");
            return;
        }

        System.out.println("Разыскиваемый автомобиль не найден :(\n" + wanted.toString());
    }
}
