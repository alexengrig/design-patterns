package dev.alexengrig.designpatterns.structural.decorator;

public class SlackNotifier extends SimpleNotifier {
    public SlackNotifier() {
        super("Slack");
    }
}
