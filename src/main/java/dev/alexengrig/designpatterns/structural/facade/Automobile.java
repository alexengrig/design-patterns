package dev.alexengrig.designpatterns.structural.facade;

public class Automobile {
    private final String name;
    private final AutomobileEngine engine;

    public Automobile(String name, AutomobileEngine engine) {
        this.name = name;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Automobile \"" + name + "\" with engine: " + engine;
    }
}
