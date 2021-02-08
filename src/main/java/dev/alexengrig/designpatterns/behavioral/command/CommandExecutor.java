package dev.alexengrig.designpatterns.behavioral.command;

public class CommandExecutor {
    public void execute(Command command) {
        command.execute();
    }
}
