package org.github.mahambach;
public class Car extends Vehicle{
    private int numberOfDoors;
    private String color;

    public Car(String manufacturer, String model, int yearOfManufacture, int numberOfDoors, String color) {
        super(manufacturer, model, yearOfManufacture);
        this.numberOfDoors = numberOfDoors;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "numberOfDoors=" + numberOfDoors +
                //", color='" + color + '\'' +
                "} " + super.toString() ;
    }
}
