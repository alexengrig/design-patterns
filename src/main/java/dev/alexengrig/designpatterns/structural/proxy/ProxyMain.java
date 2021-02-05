package dev.alexengrig.designpatterns.structural.proxy;

public class ProxyMain {
    public static void main(String[] args) {
        SomeService someService = new SomeServiceImpl();
        SomeServiceImplProxy someServiceProxy = new SomeServiceImplProxy(someService);
        someServiceProxy.doSomething("Hello!");
        someServiceProxy.doSomething("D'oh!");
        someServiceProxy.doSomething("Hello!");
        someServiceProxy.doSomething("D'oh!");
        System.out.println("Number of requests to service: " + someService.numberOfRequests());
        System.out.println("Number of requests to proxy: " + someServiceProxy.numberOfRequests());
    }
}
