package dev.alexengrig.designpatterns.structural.decorator;

public class SimpleNotifier implements Notifier {
    private final String name;

    public SimpleNotifier(String name) {
        this.name = name;
    }

    @Override
    public void notify(String message) {
        System.out.printf("Notify via %s: %s%n", name, message);
    }
}
