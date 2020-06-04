package dev.alexengrig.designpatterns.creational.factorymethod;

public class WindowsProcess implements Process {
    private final String command;

    public WindowsProcess(String command) {
        this.command = command;
    }

    @Override
    public void start() {
        System.out.println("Started Windows process for command: " + command);
    }
}
