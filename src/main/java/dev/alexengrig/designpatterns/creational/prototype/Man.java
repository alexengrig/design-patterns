package dev.alexengrig.designpatterns.creational.prototype;

import java.util.Objects;

public class Man implements Cloneable {
    private final String name;
    private final int height;
    private final int weight;

    public Man(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public Man clone() {
        try {
            return (Man) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Man man = (Man) o;
        return height == man.height &&
                weight == man.weight &&
                Objects.equals(name, man.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, height, weight);
    }

    @Override
    public String toString() {
        return "Man{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
