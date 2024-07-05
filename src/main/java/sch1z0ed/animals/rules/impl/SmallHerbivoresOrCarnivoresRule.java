package sch1z0ed.animals.rules.impl;

import sch1z0ed.animals.entity.IAnimal;
import sch1z0ed.animals.rules.IRule;

import java.util.List;

public class SmallHerbivoresOrCarnivoresRule implements IRule {
    @Override
    public int apply(List<IAnimal> animals) {
        int count = 0;
        for (IAnimal animal : animals) {
            if (animal.getHeight().getValue().equalsIgnoreCase("SMALL") &&
                    (animal.getType().getValue().equalsIgnoreCase("HERBIVORE") || animal.getType().getValue().equalsIgnoreCase("CARNIVORE"))) {
                count++;
            }
        }
        return count;
    }
}