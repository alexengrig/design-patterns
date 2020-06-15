package dev.alexengrig.designpatterns.creational.singleton;

public enum SingletonByEnum {
    INSTANCE;

    SingletonByEnum() {
        print("Initialized!");
    }

    public void print(String text) {
        System.out.println(getClass().getSimpleName() + ": " + text);
    }
}
