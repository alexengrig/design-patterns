package dev.alexengrig.designpatterns.behavioral.command;

public class CommandMain {
    public static void main(String[] args) {
        CommandExecutor executor = new CommandExecutor();
        String name = "Tom";
        executor.execute(new GreetingCommand(name));
        executor.execute(new GoodbyeCommand(name));
    }
}
