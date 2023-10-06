package org.softuni.mobilele.user;

import org.softuni.mobilele.model.entity.UserEntity;
import org.softuni.mobilele.model.entity.UserRole;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
public class CurrentUser {
    private String name;
    private boolean loggedIn;
    private String email;

    private UserRole role;


    public void login(UserEntity user) {
        this.name = user.getFirstName();
        this.loggedIn = true;
        this.email = user.getEmail();
        this.role = user.getRole();
    }


    public String getEmail() {
        return email;
    }

    public CurrentUser setEmail(String email) {
        this.email = email;
        return this;
    }

    public UserRole getRole() {
        return role;
    }

    public CurrentUser setRole(UserRole role) {
        this.role = role;
        return this;
    }

    public String getName() {
        return name;
    }

    public CurrentUser setName(String name) {
        this.name = name;
        return this;
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }

    public CurrentUser setLoggedIn(boolean loggedIn) {
        this.loggedIn = loggedIn;
        return this;
    }

    public void clear() {
        this.email = null;
        this.loggedIn = false;
        this.name = null;
    }
}
