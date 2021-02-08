package dev.alexengrig.designpatterns.behavioral.command;

public class GreetingCommand implements Command {
    private final String name;

    public GreetingCommand(String name) {
        this.name = name;
    }

    @Override
    public void execute() {
        System.out.println("Welcome, " + name + "!");
    }
}
