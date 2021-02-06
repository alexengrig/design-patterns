package dev.alexengrig.designpatterns.behavioral.chainofresponsibility;

public class ContentValidatorMiddleware extends Middleware {
    public ContentValidatorMiddleware(Middleware next) {
        super(next);
    }

    @Override
    public void handle(Request req, Response res) {
        if (isValid(req.getContent())) {
            handleNext(req, res);
        } else {
            res.setContent("Content is invalid");
        }
    }

    private boolean isValid(String content) {
        return content != null && !content.isEmpty();
    }
}
