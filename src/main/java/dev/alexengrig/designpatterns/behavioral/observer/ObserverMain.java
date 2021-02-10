package dev.alexengrig.designpatterns.behavioral.observer;

public class ObserverMain {
    public static void main(String[] args) {
        EventManager eventManager = new EventManager("one", "two");
        eventManager.subscribe("one", new LogListener());
        eventManager.subscribe("two", new LogListener());
        eventManager.notify("one");
        eventManager.notify("two");
    }
}
