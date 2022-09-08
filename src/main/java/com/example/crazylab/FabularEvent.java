package com.example.crazylab;

public enum FabularEvent {
    SAMPLE_NOT_COLLECTED ("sample_not_collected.fxml"),
    SAMPLE_COLLECTED ("sample_collected.fxml"),
    MICROSCOPE_PICTURE_NOT_TAKEN ("image_not_taken.fxml"),
    MICROSCOPE_PICTURE_TAKEN ("image_taken.fxml"),
    SEQUENCING_NOT_DONE ("sequencing_not_done.fxml"),
    SEQUENCING_DONE ("sequencing_done.fxml"),
    DATA_ANALYSIS_NOT_DONE ("data_analysis_not_done.fxml"),
    DATA_ANALYSIS_DONE ("data_analysis_done.fxml"),
    MEETING_BOSS_FIRST_TIME ("boss_popup.fxml"),
    MEETING_BOSS ("unhappy_boss.fxml"),
    MEETING_COWORKER ("coworker_popup.fxml"),
    MEETING_INFECTED ("infected_popup.fxml"),
    SYRINGE_FOUND ("found_syringe.fxml"),
    STAINING_KIT_FOUND ("found_stainingKit.fxml"),
    ENZYME_KIT_FOUND ("found_enzymeKit.fxml"),
    USB_KEY_FOUND ("found_USBkey.fxml"),
    FOUND_KEY ("found_key.fxml"),
    FOUND_MASK ("found_mask.fxml"),
    FOUND_SPRAY ("found_spray.fxml"),
    FOUND_SANDWICH ("found_sandwich.fxml"),
    ALL_TASKS_FINISHED("all_tasks_finished.fxml"),
    ALL_TASKS_NOT_FINISHED ("all_taskas_not_finished.fxml");


    private final String fxmlFile;

    FabularEvent(String fxmlFile) {
        this.fxmlFile = fxmlFile;
    }

    public String getFxmlFile() {return fxmlFile;}
}
