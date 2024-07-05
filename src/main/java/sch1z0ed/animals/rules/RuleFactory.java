package sch1z0ed.animals.rules;

import sch1z0ed.animals.rules.impl.HerbivoresRule;
import sch1z0ed.animals.rules.impl.OmnivoresNotTallRule;
import sch1z0ed.animals.rules.impl.SmallHerbivoresOrCarnivoresRule;

public class RuleFactory {
    public static IRule getRule(AnimalRule rule) {
        return switch (rule) {
            case HERBIVORES -> new HerbivoresRule();
            case SMALL_HERBIVORES_OR_CARNIVORES -> new SmallHerbivoresOrCarnivoresRule();
            case OMNIVORES_NOT_TALL -> new OmnivoresNotTallRule();
            default -> throw new UnsupportedOperationException("Unknown rule: " + rule);
        };
    }
}
