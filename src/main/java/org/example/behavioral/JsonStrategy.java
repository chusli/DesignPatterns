package org.example.behavioral;

public class JsonStrategy implements ExportStrategy {

    @Override
    public String export(ExportData data) {
        return "{\"name\":\"" + data.name() + "\","
                + "\"street\":\"" + data.street() + "\","
                + "\"salary\":" + data.salary()
                + "}";
    }

}
