package dev.alexengrig.designpatterns.creational.abstractfactory;

public class MicrosoftStaff implements Staff {
    @Override
    public String getDescription() {
        return "Microsoft staff!";
    }
}
