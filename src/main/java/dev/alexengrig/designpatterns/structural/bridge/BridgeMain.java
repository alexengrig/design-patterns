package dev.alexengrig.designpatterns.structural.bridge;

public class BridgeMain {
    public static void main(String[] args) {
        Car car = new Car(new Engine());
        car.start();
        System.out.println("Wait...");
        car.stop();
    }
}
