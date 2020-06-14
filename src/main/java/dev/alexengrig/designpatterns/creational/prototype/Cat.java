package dev.alexengrig.designpatterns.creational.prototype;

import java.util.Objects;

public class Cat {
    private final Man owner;
    private final String name;
    private final int weight;

    public Cat(Man owner, String name, int weight) {
        this.owner = owner;
        this.name = name;
        this.weight = weight;
    }

    public Cat(Cat other) {
        this(other.owner.clone(), other.name, other.weight);
    }

    public Man getOwner() {
        return owner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return weight == cat.weight &&
                Objects.equals(owner, cat.owner) &&
                Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(owner, name, weight);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "owner=" + owner +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
