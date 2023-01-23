package com.example.crazylab.items;


public enum ItemType {

    SYRINGE (142, 0, "TOOL", "found_syringe.fxml"),      //random
    VIRUS_SAMPLE (0, 0, "TOOL", ""), //do zdobycia
    STANING_KIT (247, 0, "TOOL", "found_stainingKit.fxml"),  // random
    ENZYME_KIT (137, 0, "TOOL", "found_enzymeKit.fxml"),  //random
//    DNA_SAMPLE (122, 0, "TOOL"),
    USB_KEY (99, 0, "TOOL", "found_USBkey.fxml"),   //random
    REPORT (0, 0, "TOOL", ""),    //do zdobycia
    MICROSCOPE_IMAGE (0, 0, "TOOL", ""),  //do zdobycia
    DNA_SEQUENCE (0, 0, "TOOL", ""),  //do zdobycia
    KEY (104, 0, "TOOL", "found_key.fxml"),     //ustawić
    DIY_MASK (124, 0, "ARMOR", "found_mask.fxml"), //random
    ATEST_MASK(114, 0, "ARMOR", "found_mask.fxml"), //random
    SPRAY(134, 0, "WEAPON", "found_spray.fxml.fxml"),     //random
    SANDWICH(186, 0, "WEAPON", "found_sandwich.fxml");  //random

    private final int imageId;
    private final int property;
    private final String type;
    private final String fxmlFile;

    ItemType(int imageId, int property, String type, String fxmlFile) {
        this.imageId = imageId;
        this.property = property;
        this.type = type;
        this.fxmlFile = fxmlFile;
    }

    public int getImageId() {
        return imageId;
    }

    public int getProperty() {
        return property;
    }

    public String getFxmlFile() {return fxmlFile;}

}
