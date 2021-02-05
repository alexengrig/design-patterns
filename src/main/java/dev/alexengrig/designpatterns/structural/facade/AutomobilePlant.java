package dev.alexengrig.designpatterns.structural.facade;

import java.util.ArrayList;
import java.util.List;

public class AutomobilePlant {
    private final AutomobileFactory automobileFactory = new AutomobileFactory("Ford Mustang");
    private final AutomobileEngineFactory automobileEngineFactory = new AutomobileEngineFactory("Cyclone");

    public List<Automobile> createAutomobiles(int count) {
        ArrayList<Automobile> automobiles = new ArrayList<>(count);
        for (int i = 0; i < count; i++) {
            AutomobileEngine automobileEngine = automobileEngineFactory.createAutomobileEngine();
            Automobile automobile = automobileFactory.createAutomobile(automobileEngine);
            automobiles.add(automobile);
        }
        return automobiles;
    }
}
