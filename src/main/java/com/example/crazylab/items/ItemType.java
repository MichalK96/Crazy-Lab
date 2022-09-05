package com.example.crazylab.items;

public enum ItemType {

    SYRINGE (142, 0, "TOOL"),      //random
    VIRUS_SAMPLE (0, 0, "TOOL"), //do zdobycia
    STANING_KIT (247, 0, "TOOL"),  // random
    ENZYME_KIT (137, 0, "TOOL"),  //random
//    DNA_SAMPLE (122, 0, "TOOL"),
    USB_KEY (0, 0, "TOOL"),   //random
    REPORT (0, 0, "TOOL"),    //do zdobycia
    MICROSCOPE_IMAGE (0, 0, "TOOL"),  //do zdobycia
    KEY (104, 0, "TOOL"),     //ustawić
    DIY_MASK (0, 0, "ARMOR"), //random
    ATEST_MASK(0, 0, "ARMOR"), //random
    SPRAY(0, 0, "WEAPON"),     //random
    SANDWICH(0, 0, "WEAPON");  //random

    private final int imageId;
    private final int property;
    private final String type;

    ItemType(int imageId, int property, String type) {
        this.imageId = imageId;
        this.property = property;
        this.type = type;
    }

    public int getImageId() {
        return imageId;
    }

    public int getProperty() {
        return property;
    }

    public String getType() {
        return type;
    }
}
