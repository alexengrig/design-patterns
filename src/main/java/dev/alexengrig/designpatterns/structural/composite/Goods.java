package dev.alexengrig.designpatterns.structural.composite;

public class Goods implements Priceable {
    private final String name;
    private final double price;

    public Goods(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double price() {
        return price;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
