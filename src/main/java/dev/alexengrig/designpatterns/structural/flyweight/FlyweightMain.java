package dev.alexengrig.designpatterns.structural.flyweight;

import java.util.Random;

public class FlyweightMain {
    public static void main(String[] args) {
        PersonageFactory personageFactory = new PersonageFactory();
        Random random = new Random();
        System.out.println("Personages:");
        for (int i = 0; i < 4; i++) {
            PersonageType type = random.nextBoolean() ? PersonageType.POSITIVE : PersonageType.NEGATIVE;
            Personage personage = personageFactory.createPersonage(type);
            System.out.println(personage);
        }
        System.out.println("Number of personages created: " + personageFactory.numberOfPersonages());
    }
}
