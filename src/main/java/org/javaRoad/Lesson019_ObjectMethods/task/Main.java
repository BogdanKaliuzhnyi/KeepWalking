package org.javaRoad.Lesson019_ObjectMethods.task;

import org.javaRoad.Lesson019_ObjectMethods.task.model.Car;
import org.javaRoad.Lesson019_ObjectMethods.task.utils.CarCreator;



public class Main {
    public static void main(String[] args) {
        Car wanted = CarCreator.generateRandomCar();
        Car[] cars = CarCreator.generateRandomCarArray(15);

        printReport(cars, wanted);
        findCar(cars, wanted);
    }


    public static void printCarArray(Car[] carArray) {
        for (int i = 0; i < carArray.length; i++) {
            System.out.println("Car #" + (i + 1) + ": ");
            System.out.println(carArray[i].toString());
        }
    }

    public static void printReport(Car[] carArray, Car wanted) {
        System.out.println("Разыскиваемая машина:");
        System.out.println(wanted.toString());
        System.out.println("Список автомобилей:\n");
        printCarArray(carArray);
    }

    public static void findCar(Car[] carArray, Car wanted) {
        int found = 0;

        for (int i = 0; i < carArray.length; i++) {
            if (carArray[i].hashCode() == wanted.hashCode() && carArray[i].equals(wanted)) {
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

        System.out.println("Разыскиваемый автомобиль не найден :(");
    }
}
