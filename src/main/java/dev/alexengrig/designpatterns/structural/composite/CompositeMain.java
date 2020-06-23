package dev.alexengrig.designpatterns.structural.composite;

import java.util.Arrays;

public class CompositeMain {
    public static void main(String[] args) {
        Goods book = new Goods("Book", 12.5);
        Goods notebook = new Goods("Notebook", 5.5);
        Box boxWithBookAndNotebook = new Box(Arrays.asList(book, notebook));
        Goods pen = new Goods("Pen", 1.5);
        Box box = new Box(Arrays.asList(boxWithBookAndNotebook, pen));
        System.out.println("Total price: " + box.price());
    }
}
