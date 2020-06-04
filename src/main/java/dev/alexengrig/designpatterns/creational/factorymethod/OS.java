package dev.alexengrig.designpatterns.creational.factorymethod;

public abstract class OS {
    public void execute(String command) {
        Process process = createProcess(command);
        process.start();
    }

    protected abstract Process createProcess(String command);
}
