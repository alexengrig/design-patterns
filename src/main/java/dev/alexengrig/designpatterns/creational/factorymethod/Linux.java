package dev.alexengrig.designpatterns.creational.factorymethod;

public class Linux extends OS {
    @Override
    protected Process createProcess(String command) {
        return new LinuxProcess(command);
    }
}
