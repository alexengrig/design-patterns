package dev.alexengrig.designpatterns.structural.facade;

public class AutomobileEngine {
    private final String name;

    public AutomobileEngine(String automobileEngineName) {
        this.name = automobileEngineName;
    }

    @Override
    public String toString() {
        return name;
    }
}
