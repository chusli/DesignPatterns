package org.example.behavioral;

public class Exporter {

    private ExportStrategy exportStrategy;

    public Exporter withStrategy(ExportStrategy exportStrategy) {
        this.exportStrategy = exportStrategy;
        return this;
    }

    public String exportData(ExportData data) {
        return this.exportStrategy.export(data);
    }

}
