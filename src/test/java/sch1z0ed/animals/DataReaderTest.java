package sch1z0ed.animals;

import org.junit.Test;
import sch1z0ed.animals.entity.IAnimal;
import sch1z0ed.animals.rules.AnimalRule;

import java.util.List;

import static org.junit.Assert.*;

public class DataReaderTest {
    @Test
    public void testReadAnimals() {
        List<IAnimal> animals = DataReader.readAnimals("src/test/resources/test_animals.txt");
        assertEquals(3, animals.size());
        assertEquals("LIGHT", animals.get(0).getWeight());
        assertEquals("SMALL", animals.get(0).getHeight());
        assertEquals("OMNIVORE", animals.get(0).getType());
    }

    @Test
    public void testReadRules() {
        List<AnimalRule> rules = DataReader.readRules("src/test/resources/test_rules.txt");
        assertEquals(3, rules.size());
        assertEquals(AnimalRule.HERBIVORES, rules.get(0));
        assertEquals(AnimalRule.SMALL_HERBIVORES_OR_CARNIVORES, rules.get(1));
        assertEquals(AnimalRule.OMNIVORES_NOT_TALL, rules.get(2));
    }
}