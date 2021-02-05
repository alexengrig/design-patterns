package dev.alexengrig.designpatterns.structural.flyweight;

public class Personage {
    private final PersonageType personageType;

    public Personage(PersonageType personageType) {
        this.personageType = personageType;
    }

    @Override
    public String toString() {
        switch (personageType) {
            case POSITIVE:
                return "(｡◕‿◕｡)";
            case NEGATIVE:
                return "(╬ ಠ益ಠ)";
            default:
                return "unknown";
        }
    }
}
