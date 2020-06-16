package dev.alexengrig.designpatterns.creational.converter;

public class ConverterMain {
    public static void main(String[] args) {
        Converter<User, UserDto> userConverter = new UserConverter();
        User admin = new User("admin", "admin@admin.admin");
        UserDto adminDto = userConverter.convertToRight(admin);
        System.out.println(adminDto);
        User user = userConverter.convertToLeft(adminDto);
        System.out.println(user);
    }
}
