package dev.alexengrig.designpatterns.behavioral.chainofresponsibility;

public class ContentHandlerMiddleware extends Middleware {
    public ContentHandlerMiddleware(Middleware next) {
        super(next);
    }

    @Override
    public void handle(Request req, Response res) {
        String content = req.getContent();
        res.setContent("Handled: " + content);
        handleNext(req, res);
    }
}
