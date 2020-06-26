package dev.alexengrig.designpatterns.structural.decorator;

public class DecoratorMain {
    public static void main(String[] args) {
        ComboNotifier notifier = new ComboNotifier();
        notifier.enableSlack();
        notifier.notify("Hello, world!");
        notifier.disableSlack();
        notifier.enableTelegram();
        notifier.notify("How are you?");
        notifier.disableTelegram();
    }
}
