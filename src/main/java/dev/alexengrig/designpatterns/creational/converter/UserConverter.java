package dev.alexengrig.designpatterns.creational.converter;

public class UserConverter implements Converter<User, UserDto> {
    @Override
    public UserDto convertToRight(User left) {
        return new UserDto(left.getName(), left.getEmail());
    }

    @Override
    public User convertToLeft(UserDto right) {
        return new User(right.getName(), right.getEmail());
    }
}
