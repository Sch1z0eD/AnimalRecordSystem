package sch1z0ed.animals.rules.impl;

import sch1z0ed.animals.entity.IAnimal;
import sch1z0ed.animals.rules.IRule;

import java.util.List;

// Класс правил для подсчета всеядных животных и невысокого роста
public class OmnivoresNotTallRule implements IRule {
    @Override
    public int apply(List<IAnimal> animals) {
        int count = 0;
        for (IAnimal animal : animals) {
            if (animal.getType().getValue().equalsIgnoreCase("OMNIVORE") && !animal.getHeight().getValue().equalsIgnoreCase("TALL")) {
                count++;
            }
        }
        return count;
    }
}