package com.example.sealedinterface.entities;

final public class Motorcycle implements Vehicle {
    private final String name;

    public Motorcycle(String name, int wheels) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getWheels() {
        return 2;
    }
}
