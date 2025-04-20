package com.example.sealedinterface.entities;

final public class Bicycle implements Vehicle {
    private final String name;

    public Bicycle(String name) {
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
