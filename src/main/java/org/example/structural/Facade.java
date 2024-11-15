package org.example.structural;

import java.util.stream.Stream;

public class Facade {

    private final MessyClient[] clients;

    public Facade(MessyClient... clients) {
        this.clients = clients;
    }

    private static void execute(MessyClient client) {
        client.doStuff();
        if (client.doStuffTwice()) {
            //
            client.doStuff();
        }
    }

    void execute() {
        Stream.of(clients).forEach(Facade::execute);

    }

}
