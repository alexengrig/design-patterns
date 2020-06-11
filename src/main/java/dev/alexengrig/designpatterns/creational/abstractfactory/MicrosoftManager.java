package dev.alexengrig.designpatterns.creational.abstractfactory;

public class MicrosoftManager implements Manager {
    @Override
    public String getDescription() {
        return "Microsoft manager!";
    }
}
