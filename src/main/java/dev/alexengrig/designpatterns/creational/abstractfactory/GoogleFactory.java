package dev.alexengrig.designpatterns.creational.abstractfactory;

public class GoogleFactory implements CompanyFactory {
    @Override
    public Office createOffice() {
        return new GoogleOffice();
    }

    @Override
    public Manager createManager() {
        return new GoogleManager();
    }

    @Override
    public Staff createStaff() {
        return new GoogleStaff();
    }
}
