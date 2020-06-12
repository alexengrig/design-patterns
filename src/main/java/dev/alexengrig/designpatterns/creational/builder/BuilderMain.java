package dev.alexengrig.designpatterns.creational.builder;

import java.util.Arrays;

public class BuilderMain {
    public static void main(String[] args) {
        User superAdmin = new UserBuilder()
                .name("admin")
                .password("pass123")
                .role(Role.SUPER_ADMIN)
                .roles(Arrays.asList(Role.ADMIN, Role.USER))
                .build();
        System.out.println(superAdmin);
    }
}
