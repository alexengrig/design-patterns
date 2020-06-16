package dev.alexengrig.designpatterns.creational.converter;

public interface Converter<L, R> {
    R convertToRight(L left);

    L convertToLeft(R right);
}
