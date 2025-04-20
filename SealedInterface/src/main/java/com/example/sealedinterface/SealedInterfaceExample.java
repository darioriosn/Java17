package com.example.sealedinterface;

import com.example.sealedinterface.entities.Bicycle;
import com.example.sealedinterface.entities.Car;
import com.example.sealedinterface.entities.Motorcycle;
import com.example.sealedinterface.entities.Vehicle;

public class SealedInterfaceExample {
    public static void main(String[] args) {
        // Demonstrate sealed interfaces
        System.out.println("\n=== Vehicle Examples ===");
        Vehicle[] vehicles = {
                new Car("Tesla Model S", 5),
                new Motorcycle("Harley Davidson", 2),
                new Bicycle("Mountain Bike")
        };

        for (Vehicle vehicle : vehicles) {
            System.out.println(describeVehicle(vehicle));
        }
    }


    // Method that describes vehicles - demonstrates sealed interfaces
    private static String describeVehicle(Vehicle vehicle) {
        return switch (vehicle) {
            case Car car -> car.getName() + " is a car with " + car.getSeats() + " seats";
            case Motorcycle motorcycle -> motorcycle.getName() + " is a motorcycle with " +
                    motorcycle.getWheels() + " wheels";
            case Bicycle bicycle -> bicycle.getName() + " is a human-powered bicycle";
        };
    }
}
