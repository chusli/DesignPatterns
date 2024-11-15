package org.example.behavioral;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ExportStrategyTest {

    @Test
    void csvTest() {
        Exporter exporter = new Exporter()
                .withStrategy(new CsvStrategy(';'));

        String actual = exporter.exportData(new ExportData("Max", "Musterstrasse 1", 3500));

        assertThat(actual).isEqualTo("Max;Musterstrasse 1;3500");
    }

    @Test
    void jsonTest() {
        Exporter exporter = new Exporter()
                .withStrategy(new JsonStrategy());

        String actual = exporter.exportData(new ExportData("Max", "Musterstrasse 1", 3500));

        assertThat(actual).isEqualTo("{\"name\":\"Max\",\"street\":\"Musterstrasse 1\",\"salary\":3500}");
    }

}