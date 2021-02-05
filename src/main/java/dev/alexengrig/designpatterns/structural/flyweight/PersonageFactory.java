package dev.alexengrig.designpatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class PersonageFactory {
    private final Map<PersonageType, Personage> personageByType = new HashMap<>();

    public Personage createPersonage(PersonageType personageType) {
        Personage personage = personageByType.get(personageType);
        if (personage == null) {
            personage = new Personage(personageType);
            personageByType.put(personageType, personage);
        }
        return personage;
    }

    public int numberOfPersonages() {
        return personageByType.size();
    }
}
