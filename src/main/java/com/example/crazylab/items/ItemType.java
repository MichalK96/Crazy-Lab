package com.example.crazylab.items;

public enum ItemType {

    SYRINGE (0, 0, "TOOL"),
    VIRUS_SAMPLE (0, 0, "TOOL"),
    STANING_KIT (0, 0, "TOOL"),
    ENZYME_KIT (137, 0, "TOOL"),
    DNA_SAMPLE (0, 0, "TOOL"),
    USB_KEY (0, 0, "TOOL"),
    REPORT (0, 0, "TOOL"),
    MICROSCOPE_IMAGE (0, 0, "TOOL"),
    KEY (104, 0, "TOOL"),
    DIY_MASK (0, 0, "ARMOR"),
    ATEST_MASK(0, 0, "ARMOR"),
    SPRAY(0, 0, "WEAPON"),
    SANDWICH(0, 0, "WEAPON");

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
