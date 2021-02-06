package dev.alexengrig.designpatterns.behavioral.chainofresponsibility;

public class Request {
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Request{" +
                "content='" + content + '\'' +
                '}';
    }
}
