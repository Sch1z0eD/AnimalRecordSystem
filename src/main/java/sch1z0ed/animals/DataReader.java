package sch1z0ed.animals;

import sch1z0ed.animals.entity.Animal;
import sch1z0ed.animals.entity.IAnimal;
import sch1z0ed.animals.rules.AnimalRule;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class DataReader {

    // Способ считывания данных о животных из файла и преобразования их в список объектов IAnimal
    public static List<IAnimal> readAnimals(String filePath) {
        List<IAnimal> animals = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(Paths.get(filePath));
            for (String line : lines) {
                String[] properties = line.split(",");
                animals.add(new Animal(properties[0], properties[1], properties[2]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return animals;
    }

    // Метод считывания правил из файла и преобразования их в список перечислений AnimalRule
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
