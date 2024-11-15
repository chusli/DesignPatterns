package org.example.behavioral;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class CommandIterator implements Iterator<Command> {

    List<Command> values;

    private int index = 0;

    public CommandIterator(List<Command> values) {
        this.values = new ArrayList<>(values);
    }

    @Override
    public boolean hasNext() {
        return index <= values.size() - 1;
    }

    @Override
    public Command next() {

        return values.get(index++);
    }

    @Override
    public void remove() {
        values.remove(values.get(index));
    }

    @Override
    public void forEachRemaining(Consumer<? super Command> action) {
        Iterator.super.forEachRemaining(action);
    }

}
