package org.example.behavioral;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ExecutorTest {

    @Test
    void test() {
        Executor executor = new Executor(List.of(new Move("west"), new Move("north"), new Rest(), new Attack()));

        String actual = executor.executeCommands();

        assertThat(actual).isEqualTo("moving west, moving north, resting... zzzzzz...., attacking! hayyyaaa");
    }

}