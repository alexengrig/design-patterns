package dev.alexengrig.designpatterns.creational.abstractfactory;

public class MicrosoftOffice implements Office {
    @Override
    public String getDescription() {
        return "Microsoft office!";
    }
}
