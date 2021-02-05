package dev.alexengrig.designpatterns.structural.decorator;

public class ConsoleNotifier implements Notifier {
    @Override
    public void notify(String message) {
        System.out.println(message);
    }
}
