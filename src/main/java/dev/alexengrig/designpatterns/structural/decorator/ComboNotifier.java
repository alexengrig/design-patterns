package dev.alexengrig.designpatterns.structural.decorator;

public class ComboNotifier implements Notifier {
    private SlackNotifier slackNotifier;
    private boolean slackEnabled;
    private TelegramNotifier telegramNotifier;
    private boolean telegramEnabled;

    public void enableSlack() {
        slackEnabled = true;
        if (null == slackNotifier) {
            slackNotifier = new SlackNotifier();
        }
    }

    public void disableSlack() {
        slackEnabled = false;
        slackNotifier = null;
    }

    public void enableTelegram() {
        telegramEnabled = true;
        if (null == telegramNotifier) {
            telegramNotifier = new TelegramNotifier();
        }
    }

    public void disableTelegram() {
        telegramEnabled = false;
        telegramNotifier = null;
    }

    @Override
    public void notify(String message) {
        if (slackEnabled) {
            slackNotifier.notify(message);
        }
        if (telegramEnabled) {
            telegramNotifier.notify(message);
        }
    }
}
