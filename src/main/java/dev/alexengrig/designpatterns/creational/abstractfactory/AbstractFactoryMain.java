package dev.alexengrig.designpatterns.creational.abstractfactory;

import java.util.Random;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        CompanyFactory companyFactory;
        if (new Random().nextBoolean()) {
            companyFactory = new GoogleFactory();
        } else {
            companyFactory = new MicrosoftFactory();
        }
        System.out.println(companyFactory.createOffice().getDescription());
        System.out.println(companyFactory.createManager().getDescription());
        System.out.println(companyFactory.createStaff().getDescription());
    }
}
