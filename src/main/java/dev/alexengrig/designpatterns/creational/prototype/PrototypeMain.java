package dev.alexengrig.designpatterns.creational.prototype;

public class PrototypeMain {
    public static void main(String[] args) {
        Man bob = new Man("Bob", 170, 60);
        Man bobClone = bob.clone();
        System.out.println(bobClone);
        System.out.println("Is it Bob's clone? " + (bob != bobClone && bob.equals(bobClone) ? "Yes." : "No."));
    }
}
