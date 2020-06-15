package dev.alexengrig.designpatterns.creational.singleton;

public class SingletonByDoubleCheck extends Printer {
    private static volatile SingletonByDoubleCheck INSTANCE;

    public SingletonByDoubleCheck() {
        print("Initialized!");
    }

    public static SingletonByDoubleCheck getInstance() {
        if (INSTANCE == null) {
            synchronized (SingletonByDoubleCheck.class) {
                if (INSTANCE == null) {
                    INSTANCE = new SingletonByDoubleCheck();
                }
            }
        }
        return INSTANCE;
    }
}
