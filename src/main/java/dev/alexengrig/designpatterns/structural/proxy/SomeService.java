package dev.alexengrig.designpatterns.structural.proxy;

public interface SomeService {
    Object doSomething(Object something);

    int numberOfRequests();
}
