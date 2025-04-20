package com.example.sealed.classes.entities;

sealed abstract public class Shape permits Circle, Rectangle, Triangle {
    // Common properties and methods
    private final String name;

    protected Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Abstract methods that all shapes must implement
    public abstract double calculateArea();

    // Method with default implementation
    public void draw() {
        System.out.println("Drawing a " + name);
    }
}

