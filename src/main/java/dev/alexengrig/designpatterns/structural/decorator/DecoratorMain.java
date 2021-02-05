package dev.alexengrig.designpatterns.structural.decorator;

public class DecoratorMain {
    public static void main(String[] args) {
        Notifier consoleNotifier = new ConsoleNotifier();
        consoleNotifier.notify("This is console notifier");
        Notifier withTimeNotifier = new WithTimeNotifier(consoleNotifier);
        withTimeNotifier.notify("This is console notifier with time");
    }
}
