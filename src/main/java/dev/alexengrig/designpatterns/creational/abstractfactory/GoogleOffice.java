package dev.alexengrig.designpatterns.creational.abstractfactory;

public class GoogleOffice implements Office {
    @Override
    public String getDescription() {
        return "Google office!";
    }
}
