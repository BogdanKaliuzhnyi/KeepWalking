package org.javaRoad.Lesson021_ImmutableObjects.task.task;

import org.javaRoad.Lesson021_ImmutableObjects.task.task.model.Car;
import org.javaRoad.Lesson021_ImmutableObjects.task.task.utils.CarCreator;
import org.javaRoad.Lesson021_ImmutableObjects.task.task.utils.FindCar;


public class Main {
    public static void main(String[] args) {
        Car wanted = CarCreator.generateRandomCar();
        Car[] cars = CarCreator.generateRandomCarArray(1500);
        FindCar.doResearch(cars, wanted);
    }
}
