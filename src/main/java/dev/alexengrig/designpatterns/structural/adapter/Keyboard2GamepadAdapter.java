package dev.alexengrig.designpatterns.structural.adapter;

public class Keyboard2GamepadAdapter implements Gamepad {
    private final Keyboard keyboard;

    public Keyboard2GamepadAdapter(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    @Override
    public void pressX() {
        keyboard.pressLeft();
    }

    @Override
    public void pressY() {
        keyboard.pressUp();
    }

    @Override
    public void pressA() {
        keyboard.pressDown();
    }

    @Override
    public void pressB() {
        keyboard.pressRight();
    }
}
