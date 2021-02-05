package dev.alexengrig.designpatterns.structural.facade;

public class AutomobileFactory {
    private final String automobileName;

    public AutomobileFactory(String automobileName) {
        this.automobileName = automobileName;
    }

    public Automobile createAutomobile(AutomobileEngine engine) {
        return new Automobile(automobileName, engine);
    }
}
