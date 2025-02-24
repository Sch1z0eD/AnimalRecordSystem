package sch1z0ed.animals.rules;

import sch1z0ed.animals.entity.IAnimal;

import java.util.List;

public interface IRule {
    int apply(List<IAnimal> animals);
}
