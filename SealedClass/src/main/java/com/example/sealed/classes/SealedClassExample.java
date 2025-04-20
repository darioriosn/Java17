package com.example.sealed.classes;

import com.example.sealed.classes.entities.*;

// Main class that demonstrates sealed classes
public class SealedClassExample {
    public static void main(String[] args) {
        // Create instances of each shape
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        Square square = new Square(3.0);
        Triangle triangle = new Triangle(5.0, 4.0);

        // Store shapes in an array
        Shape[] shapes = {circle, rectangle, square, triangle};

        // Process each shape
        System.out.println("=== Shape Details ===");
        for (Shape shape : shapes) {
            processShape(shape);
            System.out.println();
        }

        // Demonstrate exhaustive pattern matching with sealed classes
        System.out.println("=== Shape Classification ===");
        for (Shape shape : shapes) {
            String classification = classifyShape(shape);
            System.out.println(shape.getName() + " is classified as: " + classification);
        }

        // Demonstrate the benefit of sealed hierarchies with the draw method
        System.out.println("\n=== Drawing Shapes ===");
        for (Shape shape : shapes) {
            shape.draw();
        }

        // Try to create an invalid shape (will not compile)
        // InvalidShape invalidShape = new InvalidShape(); // Compilation error
    }

    // Method that processes a shape using pattern matching with instanceof
    private static void processShape(Shape shape) {
        // Pattern matching with instanceof (preview in Java 15)
        if (shape instanceof Circle circle) {
            System.out.println("Circle with radius: " + circle.getRadius());
            System.out.println("Area: " + circle.calculateArea());
            System.out.println("Circumference: " + circle.calculateCircumference());
        } else if (shape instanceof Rectangle rectangle) {
            System.out.println("Rectangle with width: " + rectangle.getWidth() +
                    " and height: " + rectangle.getHeight());
            System.out.println("Area: " + rectangle.calculateArea());
            System.out.println("Perimeter: " + rectangle.calculatePerimeter());
        } else if (shape instanceof Square square) {
            System.out.println("Square with side length: " + square.getSideLength());
            System.out.println("Area: " + square.calculateArea());
            System.out.println("Perimeter: " + square.calculatePerimeter());
        } else if (shape instanceof Triangle triangle) {
            System.out.println("Triangle with base: " + triangle.getBase() +
                    " and height: " + triangle.getHeight());
            System.out.println("Area: " + triangle.calculateArea());
        }
        // No default needed - compiler knows all possible subtypes
    }

    // Method that classifies shapes - demonstrates exhaustiveness checking
    private static String classifyShape(Shape shape) {
        return switch (shape) {
            case Circle c -> "Curved shape with constant radius";
            case Square s -> "Regular quadrilateral with equal sides";
            case Rectangle r -> "Quadrilateral with four right angles";
            case Triangle t -> "Three-sided polygon";
            // No default needed - compiler knows all possible subtypes
        };
    }

}
