package dev.alexengrig.designpatterns.creational.abstractfactory;

public class MicrosoftFactory implements CompanyFactory {
    @Override
    public Office createOffice() {
        return new MicrosoftOffice();
    }

    @Override
    public Manager createManager() {
        return new MicrosoftManager();
    }

    @Override
    public Staff createStaff() {
        return new MicrosoftStaff();
    }
}
