package ru.sch1z0ed.animals.entity;

import ru.sch1z0ed.animals.entity.enums.AnimalHeightEnum;
import ru.sch1z0ed.animals.entity.enums.AnimalTypeEnum;
import ru.sch1z0ed.animals.entity.enums.AnimalWeightEnum;

public interface IAnimal {
    AnimalWeightEnum getWeight();
    AnimalHeightEnum getHeight();
    AnimalTypeEnum getType();
}
