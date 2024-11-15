package org.example.behavioral;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class CommandIteratorTest {

    @Test
    void next() {
        CommandIterator commandIterator = new CommandIterator(List.of(new Move("north"), new Rest()));

        Command next = commandIterator.next();
        assertThat(next).isInstanceOf(Move.class);

        next = commandIterator.next();
        assertThat(next).isInstanceOf(Rest.class);

    }

}