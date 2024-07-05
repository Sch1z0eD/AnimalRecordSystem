package sch1z0ed.animals.entity;


import sch1z0ed.animals.entity.enums.AnimalHeightEnum;
import sch1z0ed.animals.entity.enums.AnimalTypeEnum;
import sch1z0ed.animals.entity.enums.AnimalWeightEnum;

// Класс, представляющий животное со свойствами веса, роста и типа
public class Animal implements IAnimal {
    private final AnimalWeightEnum weight;
    private final AnimalHeightEnum height;
    private final AnimalTypeEnum type;

    public Animal(AnimalWeightEnum weight, AnimalHeightEnum height, AnimalTypeEnum type) {
        this.weight = weight;
        this.height = height;
        this.type = type;
    }

    @Override
    public AnimalWeightEnum getWeight() {
        return weight;
    }

    @Override
    public AnimalHeightEnum getHeight() {
        return height;
    }

    @Override
    public AnimalTypeEnum getType() {
        return type;
    }
}