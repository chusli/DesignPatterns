package org.example.structural;

public class CircularSquareAdapter implements CircularShape {

    private final Square square;

    public CircularSquareAdapter(Square square) {
        this.square = square;
    }

    @Override
    public double getRadius() {
        // inscribed circle radius
        return square.getWidth() / 2;
    }

}
