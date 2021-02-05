package dev.alexengrig.designpatterns.structural.composite;

import java.util.Arrays;
import java.util.List;

public class Box implements Priceable {
    private final List<? extends Priceable> values;

    public Box(List<? extends Priceable> values) {
        this.values = values;
    }

    public Box(Priceable... values) {
        this(Arrays.asList(values));
    }

    @Override
    public double price() {
        return values.stream().mapToDouble(Priceable::price).sum();
    }
}
