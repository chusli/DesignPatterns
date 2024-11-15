package org.example.structural;

public class Circle implements Shape, CircularShape {

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius * radius * Math.PI;
    }

    @Override
    public double getRadius() {
        return radius;
    }

}
