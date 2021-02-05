package dev.alexengrig.designpatterns.structural.facade;

import java.util.Arrays;
import java.util.List;

public class FacadeMain {
    public static void main(String[] args) {
        AutomobilePlant automobilePlant = new AutomobilePlant();
        List<Automobile> automobiles = automobilePlant.createAutomobiles(2);
        System.out.println(Arrays.toString(automobiles.toArray()));
    }
}
