package org.example.creational;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CatTest {

    @Test
    void createCat() {
        Cat cat = Cat.withName("Stan")
                .withFur("black and white")
                .build();

        assertThat(cat.getFur()).isEqualTo("black and white");
        assertThat(cat.getName()).isEqualTo("Stan");
    }

    @Test
    void createCatOptional() {
        Cat cat = Cat.withName("Stan")
                .withFur("black and white")
                .withAttitude("angry")
                .build();

        assertThat(cat.getAttitude()).isEqualTo("angry");
    }

}