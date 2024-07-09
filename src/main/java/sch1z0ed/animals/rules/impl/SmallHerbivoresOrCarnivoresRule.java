package sch1z0ed.animals.rules.impl;

import sch1z0ed.animals.entity.IAnimal;
import sch1z0ed.animals.rules.IRule;

import java.util.List;

// Класс правил для подсчета мелких и травоядных или плотоядных животных
public class SmallHerbivoresOrCarnivoresRule implements IRule {
    @Override
    public int apply(List<IAnimal> animals) {
        int count = 0;
        for (IAnimal animal : animals) {
            if (animal.getHeight().equalsIgnoreCase("SMALL") &&
                    (animal.getType().equalsIgnoreCase("HERBIVORE") || animal.getType().equalsIgnoreCase("CARNIVORE"))) {
                count++;
            }
        }
        return count;
    }
}