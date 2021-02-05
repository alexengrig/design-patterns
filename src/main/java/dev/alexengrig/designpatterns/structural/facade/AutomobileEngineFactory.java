package dev.alexengrig.designpatterns.structural.facade;

public class AutomobileEngineFactory {
    private final String automobileEngineName;

    public AutomobileEngineFactory(String automobileEngineName) {
        this.automobileEngineName = automobileEngineName;
    }

    public AutomobileEngine createAutomobileEngine() {
        return new AutomobileEngine(automobileEngineName);
    }
}
