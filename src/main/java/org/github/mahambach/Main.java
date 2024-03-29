package org.github.mahambach;

/*Create a new Java project and implement the following steps to practice inheritance and classes in Java.

Step 1: Create a base class "Vehicle" with properties like "Manufacturer", "Model", and "Year of Manufacture".
Step 2: Create a derived class "Car" that inherits from "Vehicle" and has additional properties like "Number of Doors".
Step 3: Implement a method in the "Vehicle" class that outputs information about the vehicle.
Step 4: Override the method from step 3 in the "Car" class to also output the number of doors.
Step 5: Create instances of the "Vehicle" and "Car" classes and call the methods to output the information.
Please post the link to your GitHub repo here, where you have solved this task together. inputfield
If you have already completed this task earlier, you may work on the bonus task on the next page.
*/
public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("unknown", "unknown", 0);
        Car car = new Car("VW", "Golf", 2017, 4, "blue");
        System.out.println(vehicle);
        System.out.println(car);
        Car car2 = new Car("Audi", "Q7", 2009, 2, "black");
        System.out.println(car2);
        Motorcycle motorcycle = new Motorcycle("BMW", "R1200GS", 2015, "Enduro");
        System.out.println(motorcycle);
    }

}

