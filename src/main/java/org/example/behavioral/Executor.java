package org.example.behavioral;

import java.util.List;
import java.util.stream.Collectors;

public class Executor {

    List<Command> commands;

    public Executor(List<Command> commands) {
        this.commands = commands;
    }

    public String executeCommands() {
        return commands.stream().map(Command::execute).collect(Collectors.joining(", "));
    }

}
