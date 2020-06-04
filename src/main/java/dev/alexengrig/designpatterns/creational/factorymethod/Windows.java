package dev.alexengrig.designpatterns.creational.factorymethod;

public class Windows extends OS{
    @Override
    protected Process createProcess(String command) {
        return new WindowsProcess(command);
    }
}
