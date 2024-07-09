package sch1z0ed.animals;

import org.junit.Test;
import sch1z0ed.animals.entity.Animal;
import sch1z0ed.animals.entity.IAnimal;
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
        animals.add(new Animal("HEAVY", "SMALL", "HERBIVORE"));
        animals.add(new Animal("HEAVY", "SHORT", "HERBIVORE"));
        animals.add(new Animal("LIGHT", "SMALL", "OMNIVORE"));

        IRule ruleEngine = RuleFactory.getRule(AnimalRule.HERBIVORES);
        int result = ruleEngine.apply(animals);
        assertEquals(2, result);
    }

    @Test
    public void testSmallHerbivoresOrCarnivoresRule() {
        List<IAnimal> animals = new ArrayList<>();
        animals.add(new Animal("HEAVY", "SMALL", "HERBIVORE"));
        animals.add(new Animal("HEAVY", "SMALL", "CARNIVORE"));
        animals.add(new Animal("LIGHT", "TALL", "OMNIVORE"));

        IRule ruleEngine = RuleFactory.getRule(AnimalRule.SMALL_HERBIVORES_OR_CARNIVORES);
        int result = ruleEngine.apply(animals);
        assertEquals(2, result);
    }

    @Test
    public void testOmnivoresNotTallRule() {
        List<IAnimal> animals = new ArrayList<>();
        animals.add(new Animal("LIGHT", "SMALL", "OMNIVORE"));
        animals.add(new Animal("HEAVY", "TALL", "OMNIVORE"));
        animals.add(new Animal("MEDIUM", "SHORT", "OMNIVORE"));

        IRule ruleEngine = RuleFactory.getRule(AnimalRule.OMNIVORES_NOT_TALL);
        int result = ruleEngine.apply(animals);
        assertEquals(2, result);
    }
}