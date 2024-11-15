package org.example.structural;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AdapterTest {

    @Test
    void test() {
        final double radius = 3;
        Circle circle = new Circle(radius);
        Square square = new Square(6);

        double inscribedCircleRadius = new CircularSquareAdapter(square).getRadius();

        assertThat(new Circle(inscribedCircleRadius)).usingRecursiveComparison().isEqualTo(circle);
    }

}