package org.javaRoad.Lesson019_ObjectMethods.task.model;

public class Car {
    private final String color;
    private final String manufacturer;
    private final String model;
    private final String plateNumber;
    private final String yearOfManufacture;

    public Car(String color, String manufacturer, String model, String plateNumber, String yearOfManufacture) {
        this.color = color;
        this.manufacturer = manufacturer;
        this.model = model;
        this.plateNumber = plateNumber;
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getColor() {
        return color;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public String getYearOfManufacture() {
        return yearOfManufacture;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Color: ").append(color).append("\n");
        sb.append("Manufacturer: ").append(manufacturer).append("\n");
        sb.append("Model: ").append(model).append("\n");
        sb.append("PlateNumber: ").append(plateNumber).append("\n");
        sb.append("Year of Manufacture: ").append(yearOfManufacture).append("\n");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) { //Гарантируем рефлексивность
            return true;
        }
        if (o == null) {
            return false;
        }
        if (!getClass().equals(o.getClass())) {
            return false;
        }
        Car car = (Car) o;

        return this.color.equals(car.getColor()) && this.manufacturer.equals(car.getManufacturer())
                && this.model.equals(car.getModel()) && this.plateNumber.equals(car.getPlateNumber())
                && this.yearOfManufacture.equals(car.getYearOfManufacture());
    }

    @Override
    public int hashCode() {
        int result = color.hashCode();
        result = 31 * result + manufacturer.hashCode();
        result = 31 * result + model.hashCode();
        result = 31 * result + plateNumber.hashCode();
        result = 31 * result + yearOfManufacture.hashCode();
        return result;
    }
}