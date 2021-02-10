package dev.alexengrig.designpatterns.behavioral.observer;

public class LogListener implements EventListener {
    @Override
    public void update(String name) {
        System.out.println("Event: " + name);
    }
}
