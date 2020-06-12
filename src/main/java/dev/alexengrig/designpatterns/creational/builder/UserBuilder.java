package dev.alexengrig.designpatterns.creational.builder;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class UserBuilder {
    private final Set<Role> roles = new HashSet<>();
    private String name;
    private String password;

    public UserBuilder name(String name) {
        this.name = name;
        return this;
    }

    public UserBuilder password(String password) {
        this.password = password;
        return this;
    }

    public UserBuilder role(Role role) {
        roles.add(role);
        return this;
    }

    public UserBuilder roles(Collection<Role> roles) {
        this.roles.addAll(roles);
        return this;
    }

    public User build() {
        return new User(name, password, roles);
    }
}
