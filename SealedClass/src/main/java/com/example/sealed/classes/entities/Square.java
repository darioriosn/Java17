package com.example.sealed.classes.entities;


// Subclass of Rectangle - must be final, sealed, or non-sealed
final public class Square extends Rectangle {
    private final double sideLength;

    public Square(double sideLength) {
        super(sideLength, sideLength);
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Square");
        System.out.println("  ■");
    }
}
