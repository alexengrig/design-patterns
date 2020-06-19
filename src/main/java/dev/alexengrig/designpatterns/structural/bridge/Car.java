package dev.alexengrig.designpatterns.structural.bridge;

public class Car {
    private final Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        System.out.println("Inserted and turned the key.");
        engine.start();
    }

    public void stop() {
        System.out.println("Turned the key.");
        engine.stop();
        System.out.println("Pulled out the key.");
    }
}
