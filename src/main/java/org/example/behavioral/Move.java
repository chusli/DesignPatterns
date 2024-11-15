package org.example.behavioral;

public class Move implements Command {

    private final String direction;

    public Move(String direction) {
        this.direction = direction;
    }

    @Override
    public String execute() {
        return "moving " + direction;
    }

}
