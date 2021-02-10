package dev.alexengrig.designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager {
    private final Map<String, List<EventListener>> listeners;

    public EventManager(String... names) {
        this.listeners = new HashMap<>(names.length);
        for (String name : names) {
            this.listeners.put(name, new ArrayList<>());
        }
    }

    public void subscribe(String name, EventListener listener) {
        List<EventListener> eventListeners = listeners.get(name);
        if (eventListeners == null) {
            throw new IllegalArgumentException("Unknown event name: " + name);
        }
        eventListeners.add(listener);
    }

    public void unsubscribe(String name, EventListener listener) {
        List<EventListener> eventListeners = listeners.get(name);
        if (eventListeners == null) {
            throw new IllegalArgumentException("Unknown event name: " + name);
        }
        eventListeners.remove(listener);
    }

    public void notify(String name) {
        List<EventListener> eventListeners = listeners.get(name);
        if (eventListeners == null) {
            throw new IllegalArgumentException("Unknown event name: " + name);
        }
        for (EventListener eventListener : eventListeners) {
            eventListener.update(name);
        }
    }
}
