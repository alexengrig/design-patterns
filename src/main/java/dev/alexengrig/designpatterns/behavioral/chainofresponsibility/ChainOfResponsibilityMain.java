package dev.alexengrig.designpatterns.behavioral.chainofresponsibility;

public class ChainOfResponsibilityMain {
    public static void main(String[] args) {
        Middleware chain = new ContentValidatorMiddleware(new ContentHandlerMiddleware(null));

        Request request = new Request();
        request.setContent("Some data");
        Response response = new Response();
        chain.handle(request, response);
        System.out.println(request + " / " + response);

        request = new Request();
        response = new Response();
        chain.handle(request, response);
        System.out.println(request + " / " + response);
    }
}
