package dev.alexengrig.designpatterns.structural.proxy;

import java.util.HashMap;
import java.util.Map;

public class SomeServiceImplProxy implements SomeService {
    private final SomeService someService;
    private final Map<Object, Object> results = new HashMap<>();

    private int numberOfRequests;

    public SomeServiceImplProxy(SomeService someService) {
        this.someService = someService;
    }

    @Override
    public Object doSomething(Object something) {
        numberOfRequests++;
        Object result = results.get(something);
        if (result == null) {
            result = someService.doSomething(something);
            results.put(something, result);
        }
        return result;
    }

    @Override
    public int numberOfRequests() {
        return numberOfRequests;
    }
}
