package org.softuni.mobilele.model.dto;

public class LoggedUserDTO {
    private String firstName;
    private String lastName;
    private String email;

    public String getFirstName() {
        return firstName;
    }

    public LoggedUserDTO setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public LoggedUserDTO setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public LoggedUserDTO setEmail(String email) {
        this.email = email;
        return this;
    }
}
