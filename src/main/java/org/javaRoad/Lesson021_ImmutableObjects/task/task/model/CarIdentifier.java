package org.javaRoad.Lesson021_ImmutableObjects.task.task.model;

import org.javaRoad.Lesson021_ImmutableObjects.task.task.utils.FieldValidator;

import java.util.Objects;

public final class CarIdentifier {
    private final String plateNumber;
    private final String manufacturer;
    private final String model;
    private final String yearOfManufacture;

    public CarIdentifier(String plateNumber, String manufacturer, String model, String yearOfManufacture) {
        this.plateNumber = FieldValidator.validateField(plateNumber, "PlateNumber");
        this.manufacturer = FieldValidator.validateField(manufacturer, "manufacturer");
        this.model = FieldValidator.validateField(model, "model");
        this.yearOfManufacture = FieldValidator.validateField(yearOfManufacture, "yearOfManufacture");
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public String getYearOfManufacture() {
        return yearOfManufacture;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (!getClass().equals(o.getClass())) {
            return false;
        }
        CarIdentifier identifier = (CarIdentifier) o;

        return Objects.equals(plateNumber, identifier.plateNumber)
                && Objects.equals(manufacturer, identifier.manufacturer)
                && Objects.equals(model, identifier.model)
                && Objects.equals(yearOfManufacture, identifier.yearOfManufacture);
    }

    @Override
    public int hashCode() {
        int hashCode = plateNumber.hashCode();
        hashCode += manufacturer.hashCode();
        hashCode += model.hashCode();
        hashCode += manufacturer.hashCode();
        return hashCode;
    }
}
