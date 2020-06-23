package dev.alexengrig.designpatterns.structural.composite;

import java.util.List;

public class Box implements Priceable {
    private final List<? extends Priceable> values;

    public Box(List<? extends Priceable> values) {
        this.values = values;
    }

    @Override
    public double price() {
        return values.stream().mapToDouble(Priceable::price).sum();
    }
}
