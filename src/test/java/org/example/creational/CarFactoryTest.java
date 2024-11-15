package org.example.creational;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CarFactoryTest {

    @Test
    void createAllCars() {
        Car tractor = new TractorFactory().build();
        Car sedan = new SedanFactory().build();
        Car jeep = new JeepFactory().build();

        assertThat(tractor).isInstanceOf(Tractor.class);
        assertThat(sedan).isInstanceOf(Sedan.class);
        assertThat(jeep).isInstanceOf(Jeep.class);
    }

}