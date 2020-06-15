package dev.alexengrig.designpatterns.creational.singleton;

public class Printer {
    public void print(String text) {
        System.out.println(getClass().getSimpleName() + ": " + text);
    }
}
