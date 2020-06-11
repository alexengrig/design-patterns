package dev.alexengrig.designpatterns.creational.abstractfactory;

public class GoogleStaff implements Staff {
    @Override
    public String getDescription() {
        return "Google staff!";
    }
}
