package org.javaRoad.Lesson021_ImmutableObjects.task.task.utils;

import org.javaRoad.Lesson021_ImmutableObjects.task.task.model.Car;

import java.util.Random;

public class CarCreator {
    private static final String[] COLORS = {"White", "Black", "Red", "Yellow", "Blue"};
    private static final String[] MANUFACTURERS = {"Toyota", "BMW", "Honda"};
    private static final String[] MODELS_TOYOTA = {"RAV4", "Fortuner", "Corolla", "Camry"};
    private static final String[] MODELS_BMW = {"M5", "X6", "X7"};
    private static final String[] MODELS_HONDA = {"Civic", "CRV", "Brio"};
    private static final String[] CAR_PLATES = {"A444BC", "B355TE", "C643OP", "E853KK", "H5434AK", "K777MK",
            "X748XX", "M854KO", "O683HH", "T494AA", "P043PO"};
    private static final String[] MANUFACTURE_YEAR = {"2026", "2025", "2024"};

    public static Car generateRandomCar() {
        Random rand = new Random();
        String tempColor = COLORS[rand.nextInt(COLORS.length)];
        String tempManufacturer = MANUFACTURERS[rand.nextInt(MANUFACTURERS.length)];
        String tempModel = combineManufacturerModel(tempManufacturer, rand);
        String tempPlateNumber = CAR_PLATES[rand.nextInt(CAR_PLATES.length)];
        String tempYearOfManufacture = MANUFACTURE_YEAR[rand.nextInt(MANUFACTURE_YEAR.length)];
        return new Car(tempColor, tempManufacturer, tempModel, tempPlateNumber, tempYearOfManufacture);
    }

    public static Car[] generateRandomCarArray(int length) {
       Car[] cars = new Car[length];
        for (int i = 0; i < length; i++) {
           cars[i] = generateRandomCar();
        }
        return cars;
    }

    private static String combineManufacturerModel(String manufacturer, Random rand) {
        return switch (manufacturer) {
            case "Toyota" -> MODELS_TOYOTA[rand.nextInt(0, MODELS_TOYOTA.length)];
            case "BMW" -> MODELS_BMW[rand.nextInt(0, MODELS_BMW.length)];
            case "Honda" -> MODELS_HONDA[rand.nextInt(0, MODELS_HONDA.length)];
            default -> "Unknown model";
        };
    }


}
