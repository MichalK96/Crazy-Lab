package com.example.crazylab;

public enum FabularEvent {
    SAMPLE_NOT_COLLECTED ("sample_not_collected.fxml"),
    SAMPLE_COLLECTED ("sample_collected.fxml"),
    MICROSCOPE_PICTURE_NOT_TAKEN ("found_enzymeKit.fxml"),
    MICROSCOPE_PICTURE_TAKEN ("found_enzymeKit.fxml"),
    SEQUENCING_NOT_DONE ("found_enzymeKit.fxml"),
    SEQUENCING_DONE ("found_enzymeKit.fxml"),
    DATA_ANALYSIS_NOT_DONE ("found_enzymeKit.fxml"),
    DATA_ANALYSIS_DONE ("found_enzymeKit.fxml");

    private final String fxmlFile;

    FabularEvent(String fxmlFile) {
        this.fxmlFile = fxmlFile;
    }

    public String getFxmlFile() {return fxmlFile;}
}
