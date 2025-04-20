package com.example.sealedinterface.entities;

final public class Car implements Vehicle {
    private final String name;
    private final int seats;

    public Car(String name, int seats) {
        this.name = name;
        this.seats = seats;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getWheels() {
        return 4;
    }

    public int getSeats() {
        return seats;
    }
}

