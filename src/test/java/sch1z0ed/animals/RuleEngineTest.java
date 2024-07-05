package sch1z0ed.animals;

import org.junit.Test;
import sch1z0ed.animals.entity.Animal;
import sch1z0ed.animals.entity.IAnimal;
import sch1z0ed.animals.entity.enums.AnimalHeightEnum;
import sch1z0ed.animals.entity.enums.AnimalTypeEnum;
import sch1z0ed.animals.entity.enums.AnimalWeightEnum;
import sch1z0ed.animals.rules.AnimalRule;
import sch1z0ed.animals.rules.IRule;
import sch1z0ed.animals.rules.RuleFactory;


import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class RuleEngineTest {
    @Test
    public void testHerbivoresRule() {
        List<IAnimal> animals = new ArrayList<>();
        animals.add(new Animal(AnimalWeightEnum.HEAVY, AnimalHeightEnum.SMALL, AnimalTypeEnum.HERBIVORE));
        animals.add(new Animal(AnimalWeightEnum.HEAVY, AnimalHeightEnum.SHORT, AnimalTypeEnum.HERBIVORE));
        animals.add(new Animal(AnimalWeightEnum.LIGHT, AnimalHeightEnum.SMALL, AnimalTypeEnum.OMNIVORE));

        IRule ruleEngine = RuleFactory.getRule(AnimalRule.HERBIVORES);
        int result = ruleEngine.apply(animals);
        assertEquals(2, result);
    }

    @Test
    public void testSmallHerbivoresOrCarnivoresRule() {
        List<IAnimal> animals = new ArrayList<>();
        animals.add(new Animal(AnimalWeightEnum.HEAVY, AnimalHeightEnum.SMALL, AnimalTypeEnum.HERBIVORE));
        animals.add(new Animal(AnimalWeightEnum.HEAVY, AnimalHeightEnum.SMALL, AnimalTypeEnum.CARNIVORE));
        animals.add(new Animal(AnimalWeightEnum.LIGHT, AnimalHeightEnum.TALL, AnimalTypeEnum.OMNIVORE));

        IRule ruleEngine = RuleFactory.getRule(AnimalRule.SMALL_HERBIVORES_OR_CARNIVORES);
        int result = ruleEngine.apply(animals);
        assertEquals(2, result);
    }

    @Test
    public void testOmnivoresNotTallRule() {
        List<IAnimal> animals = new ArrayList<>();
        animals.add(new Animal(AnimalWeightEnum.LIGHT, AnimalHeightEnum.SMALL, AnimalTypeEnum.OMNIVORE));
        animals.add(new Animal(AnimalWeightEnum.HEAVY, AnimalHeightEnum.TALL, AnimalTypeEnum.OMNIVORE));
        animals.add(new Animal(AnimalWeightEnum.MEDIUM, AnimalHeightEnum.SHORT, AnimalTypeEnum.OMNIVORE));

        IRule ruleEngine = RuleFactory.getRule(AnimalRule.OMNIVORES_NOT_TALL);
        int result = ruleEngine.apply(animals);
        assertEquals(2, result);
    }
}