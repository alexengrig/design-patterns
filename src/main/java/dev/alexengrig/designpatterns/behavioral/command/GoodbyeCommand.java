package dev.alexengrig.designpatterns.behavioral.command;

public class GoodbyeCommand implements Command {
    private final String name;

    public GoodbyeCommand(String name) {
        this.name = name;
    }

    @Override
    public void execute() {
        System.out.println("Goodbye, " + name + "!");
    }
}
