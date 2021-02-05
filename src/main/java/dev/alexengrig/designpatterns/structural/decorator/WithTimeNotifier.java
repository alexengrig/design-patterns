package dev.alexengrig.designpatterns.structural.decorator;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class WithTimeNotifier implements Notifier {
    private final Notifier notifier;

    public WithTimeNotifier(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void notify(String message) {
        String messageWithTime = getMessageWithTime(message);
        notifier.notify(messageWithTime);
    }

    private String getMessageWithTime(String message) {
        return LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME) + ": " + message;
    }
}
