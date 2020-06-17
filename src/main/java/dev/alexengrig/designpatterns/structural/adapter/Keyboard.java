package dev.alexengrig.designpatterns.structural.adapter;

public class Keyboard {
    private void press(String key) {
        System.out.println("Pressed key: " + key);
    }

    public void pressLeft() {
        press("Left arrow");
    }

    public void pressUp() {
        press("Up arrow");
    }

    public void pressDown() {
        press("Down arrow");
    }

    public void pressRight() {
        press("Right arrow");
    }
}
