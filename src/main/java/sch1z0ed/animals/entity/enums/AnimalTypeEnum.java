package sch1z0ed.animals.entity.enums;

public enum AnimalTypeEnum {
    HERBIVORE("herbivore"),
    CARNIVORE("carnivore"),
    OMNIVORE("omnivore");

    private final String value;

    AnimalTypeEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    // Статический метод для получения значения перечисления из строки
    public static AnimalTypeEnum fromValue(String value) {
        for (AnimalTypeEnum type : values()) {
            if (type.getValue().equalsIgnoreCase(value)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown type: " + value);
    }
}
