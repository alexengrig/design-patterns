package dev.alexengrig.designpatterns.creational.factorymethod;

public class LinuxProcess implements Process {
    private final String command;

    public LinuxProcess(String command) {
        this.command = command;
    }

    @Override
    public void start() {
        System.out.println("Started Linux process for command: " + command);
    }
}
