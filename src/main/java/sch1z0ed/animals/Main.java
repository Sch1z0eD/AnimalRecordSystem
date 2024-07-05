package sch1z0ed.animals;


import sch1z0ed.animals.entity.IAnimal;
import sch1z0ed.animals.rules.AnimalRule;
import sch1z0ed.animals.rules.IRule;
import sch1z0ed.animals.rules.RuleFactory;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<IAnimal> animals = DataReader.readAnimals("src/main/resources/animals.txt");
        List<AnimalRule> rules = DataReader.readRules("src/main/resources/rules.txt");

        for (AnimalRule rule : rules) {
            IRule ruleEngine = RuleFactory.getRule(rule);
            int result = ruleEngine.apply(animals);
            System.out.println("Result for rule '" + rule + "': " + result);
        }
    }
}