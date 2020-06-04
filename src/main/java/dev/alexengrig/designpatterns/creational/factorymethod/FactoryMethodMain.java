package dev.alexengrig.designpatterns.creational.factorymethod;

public class FactoryMethodMain {
    public static void main(String[] args) {
        String osName = System.getProperty("os.name");
        OS os;
        if (osName.startsWith("Windows")) {
            os = new Windows();
        } else {
            os = new Linux();
        }
        os.execute("java --version");
    }
}
