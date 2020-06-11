package dev.alexengrig.designpatterns.creational.abstractfactory;

public class GoogleManager implements Manager{
    @Override
    public String getDescription() {
        return "Google manager!";
    }
}
