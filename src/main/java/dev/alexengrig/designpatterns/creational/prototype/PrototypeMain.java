package dev.alexengrig.designpatterns.creational.prototype;

public class PrototypeMain {
    public static void main(String[] args) {
        Man bob = new Man("Bob", 170, 60);
        Cat tom = new Cat(bob, "Tom", 2);
        Cat tomClone = new Cat(tom);
        System.out.println(tomClone);
        System.out.println("Is it Tom's clone? " + (isClone(tom, tomClone) ? "Yes." : "No."));
        Man bobClone = tomClone.getOwner();
        System.out.println("Is it Bob's clone? " + (isClone(bob, bobClone) ? "Yes." : "No."));
    }

    private static boolean isClone(Object object, Object clone) {
        return object != clone && object.equals(clone);
    }
}
