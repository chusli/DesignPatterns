package org.example.creational;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SheepTest {

    @Test
    void cloneDolly() {
        Sheep originalSheep = new Sheep("white", "fluffy");
        Sheep clone = originalSheep.clone();

        clone.setTexture("shorn");

        assertThat(clone.getTexture()).isEqualTo("shorn");
    }

}