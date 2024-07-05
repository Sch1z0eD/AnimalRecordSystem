package ru.sch1z0ed.animals.entity.enums;

public enum AnimalHeightEnum {
    SMALL("small"),
    SHORT("short"),
    TALL("tall");

    private final String value;

    AnimalHeightEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static AnimalHeightEnum fromValue(String value) {
        for (AnimalHeightEnum height : values()) {
            if (height.getValue().equalsIgnoreCase(value)) {
                return height;
            }
        }
        throw new IllegalArgumentException("Unknown height: " + value);
    }
}
