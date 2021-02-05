package dev.alexengrig.designpatterns.structural.proxy;

public class SomeServiceImpl implements SomeService {

    private int numberOfRequests;

    @Override
    public Object doSomething(Object something) {
        numberOfRequests++;
        return something + " and something";
    }

    @Override
    public int numberOfRequests() {
        return numberOfRequests;
    }
}
