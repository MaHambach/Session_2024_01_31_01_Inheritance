package org.github.mahambach;

public class Motorcycle extends Vehicle{
    private String type;

    public Motorcycle(String manufacturer, String model, int yearOfManufacture, String type) {
        super(manufacturer, model, yearOfManufacture);
        this.type=type;
    }


    public String getType(){
        return this.type;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "type='" + type + '\'' +
                "} " + super.toString() ;
    }
}
