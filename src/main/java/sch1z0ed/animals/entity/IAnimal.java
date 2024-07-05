package sch1z0ed.animals.entity;

import sch1z0ed.animals.entity.enums.AnimalHeightEnum;
import sch1z0ed.animals.entity.enums.AnimalTypeEnum;
import sch1z0ed.animals.entity.enums.AnimalWeightEnum;

public interface IAnimal {
    AnimalWeightEnum getWeight();
    AnimalHeightEnum getHeight();
    AnimalTypeEnum getType();
}
