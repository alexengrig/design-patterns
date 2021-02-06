package dev.alexengrig.designpatterns.behavioral.chainofresponsibility;

public abstract class Middleware {
    private final Middleware next;

    public Middleware(Middleware next) {
        this.next = next;
    }

    public abstract void handle(Request req, Response res);

    protected void handleNext(Request req, Response res) {
        if (next != null) {
            next.handle(req, res);
        }
    }
}
