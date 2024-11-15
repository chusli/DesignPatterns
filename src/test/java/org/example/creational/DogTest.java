package org.example.creational;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DogTest {

    @Test
    void createAllTypesFromString() {
        Dog actualCorgi = Dog.create("corgi");
        Dog actualShepherd = Dog.create("shepherd");
        Dog actualPug = Dog.create("pug");

        assertThat(actualCorgi).isInstanceOf(Dog.Corgi.class);
        assertThat(actualShepherd).isInstanceOf(Dog.GermanShepherd.class);
        assertThat(actualPug).isInstanceOf(Dog.Pug.class);
    }

    @Test
    void createAllTypesFrom() {
    }

}