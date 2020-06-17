package dev.alexengrig.designpatterns.structural.adapter;

public class AdapterMain {
    public static void main(String[] args) {
        Keyboard keyboard = new Keyboard();
        Gamepad gamepadAdapter = new Keyboard2GamepadAdapter(keyboard);
        gamepadAdapter.pressX();
        gamepadAdapter.pressY();
        gamepadAdapter.pressA();
        gamepadAdapter.pressB();
    }
}
