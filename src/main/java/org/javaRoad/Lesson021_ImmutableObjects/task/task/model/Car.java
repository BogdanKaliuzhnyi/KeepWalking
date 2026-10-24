package org.javaRoad.Lesson021_ImmutableObjects.task.task.model;

import org.javaRoad.Lesson021_ImmutableObjects.task.task.utils.FieldValidator;

public class Car {
    public final CarIdentifier identifier;
    private String color;


    public Car(String color, String manufacturer, String model, String plateNumber, String yearOfManufacture) {
        this(new CarIdentifier(plateNumber, manufacturer, model, yearOfManufacture), color);
    }

    private Car(CarIdentifier identifier, String color) {
        this.identifier = identifier;
        this.color = FieldValidator.validateField(color, "Color");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = FieldValidator.validateField(color, "Color");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Color: ").append(color).append("\n");
        sb.append("PlateNumber: ").append(identifier.getPlateNumber()).append("\n");
        sb.append("Manufacturer: ").append(identifier.getManufacturer()).append("\n");
        sb.append("Model: ").append(identifier.getModel()).append("\n");
        sb.append("Year of Manufacture: ").append(identifier.getYearOfManufacture()).append("\n");
        return sb.toString();
    }
}