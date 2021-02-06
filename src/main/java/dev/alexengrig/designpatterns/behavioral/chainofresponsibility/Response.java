package dev.alexengrig.designpatterns.behavioral.chainofresponsibility;

public class Response {
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Response{" +
                "content='" + content + '\'' +
                '}';
    }
}
