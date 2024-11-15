package org.example.structural;

public class Square implements Shape {

    private final double width;

    public Square(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public double area() {
        return Math.pow(width, 2);
    }

}
