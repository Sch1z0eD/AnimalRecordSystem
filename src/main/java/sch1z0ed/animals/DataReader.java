package sch1z0ed.animals;

import sch1z0ed.animals.entity.Animal;
import sch1z0ed.animals.entity.IAnimal;
import sch1z0ed.animals.entity.enums.AnimalHeightEnum;
import sch1z0ed.animals.entity.enums.AnimalTypeEnum;
import sch1z0ed.animals.entity.enums.AnimalWeightEnum;
import sch1z0ed.animals.rules.AnimalRule;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class DataReader {

    public static List<IAnimal> readAnimals(String filePath) {
        List<IAnimal> animals = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(Paths.get(filePath));
            for (String line : lines) {
                String[] properties = line.split(",");
                AnimalWeightEnum weight = AnimalWeightEnum.fromValue(properties[0]);
                AnimalHeightEnum height = AnimalHeightEnum.fromValue(properties[1]);
                AnimalTypeEnum type = AnimalTypeEnum.fromValue(properties[2]);
                animals.add(new Animal(weight, height, type));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return animals;
    }

    public static List<AnimalRule> readRules(String filePath) {
        List<AnimalRule> rules = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(Paths.get(filePath));
            for (String line : lines) {
                rules.add(AnimalRule.valueOf(line.trim().toUpperCase()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return rules;
    }
}
