package com.example.sealed.classes.entities;


// Third permitted subclass - using non-sealed to allow unrestricted extension
non-sealed public class Triangle extends Shape {
    private final double base;
    private final double height;

    public Triangle(double base, double height) {
        super("Triangle");
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("  △");
    }
}
