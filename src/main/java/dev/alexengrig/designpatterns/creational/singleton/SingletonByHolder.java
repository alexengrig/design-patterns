package dev.alexengrig.designpatterns.creational.singleton;

public class SingletonByHolder extends Printer {
    public SingletonByHolder() {
        print("Initialized!");
    }

    public static SingletonByHolder getInstance() {
        return Holder.INSTANCE;
    }

    private static final class Holder {
        private static final SingletonByHolder INSTANCE = new SingletonByHolder();
    }
}
