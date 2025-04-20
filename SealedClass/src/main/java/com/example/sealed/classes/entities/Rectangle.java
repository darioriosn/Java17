package com.example.sealed.classes.entities;

// Second permitted subclass - sealed to allow only Square to extend it
sealed public class Rectangle extends Shape permits Square {
    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        super("Rectangle");
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("  □");
    }
}
