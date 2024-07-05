package sch1z0ed.animals.entity.enums;

public enum AnimalWeightEnum {
    LIGHT("light"),
    MEDIUM("medium"),
    HEAVY("heavy");

    private final String value;

    AnimalWeightEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static AnimalWeightEnum fromValue(String value) {
        for (AnimalWeightEnum weight : values()) {
            if (weight.getValue().equalsIgnoreCase(value)) {
                return weight;
            }
        }
        throw new IllegalArgumentException("Unknown weight: " + value);
    }
}
