package dev.alexengrig.designpatterns.creational.abstractfactory;

public interface CompanyFactory {
    Office createOffice();

    Manager createManager();

    Staff createStaff();
}
