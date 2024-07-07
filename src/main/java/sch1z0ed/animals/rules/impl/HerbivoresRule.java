package sch1z0ed.animals.rules.impl;

import sch1z0ed.animals.entity.IAnimal;
import sch1z0ed.animals.entity.enums.AnimalTypeEnum;
import sch1z0ed.animals.rules.IRule;

import java.util.List;

// Класс правил для подсчета травоядных животных
public class HerbivoresRule implements IRule {
    @Override
    public int apply(List<IAnimal> animals) {
        int count = 0;
        for (IAnimal animal : animals) {
            if (animal.getType() == AnimalTypeEnum.HERBIVORE) {
                count++;
            }
        }
        return count;
    }
}