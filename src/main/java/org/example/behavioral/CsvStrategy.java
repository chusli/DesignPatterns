package org.example.behavioral;

public class CsvStrategy implements ExportStrategy {

    private final char delimiter;

    public CsvStrategy(char delimiter) {
        this.delimiter = delimiter;
    }

    @Override
    public String export(ExportData data) {
        return data.name() + delimiter + data.street() + delimiter + data.salary();
    }

}
