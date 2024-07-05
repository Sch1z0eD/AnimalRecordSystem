package sch1z0ed.animals.entity.enums;

import org.junit.Test;
import static org.junit.Assert.*;

public class AnimalEnumTest {
    @Test
    public void testAnimalWeightEnum() {
        assertEquals(AnimalWeightEnum.LIGHT, AnimalWeightEnum.fromValue("light"));
        assertEquals(AnimalWeightEnum.MEDIUM, AnimalWeightEnum.fromValue("medium"));
        assertEquals(AnimalWeightEnum.HEAVY, AnimalWeightEnum.fromValue("heavy"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidAnimalWeightEnum() {
        AnimalWeightEnum.fromValue("invalid");
    }

    @Test
    public void testAnimalHeightEnum() {
        assertEquals(AnimalHeightEnum.SMALL, AnimalHeightEnum.fromValue("small"));
        assertEquals(AnimalHeightEnum.SHORT, AnimalHeightEnum.fromValue("short"));
        assertEquals(AnimalHeightEnum.TALL, AnimalHeightEnum.fromValue("tall"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidAnimalHeightEnum() {
        AnimalHeightEnum.fromValue("invalid");
    }

    @Test
    public void testAnimalTypeEnum() {
        assertEquals(AnimalTypeEnum.HERBIVORE, AnimalTypeEnum.fromValue("herbivore"));
        assertEquals(AnimalTypeEnum.CARNIVORE, AnimalTypeEnum.fromValue("carnivore"));
        assertEquals(AnimalTypeEnum.OMNIVORE, AnimalTypeEnum.fromValue("omnivore"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidAnimalTypeEnum() {
        AnimalTypeEnum.fromValue("invalid");
    }
}