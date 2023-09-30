package org.softuni.mobilele.model.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class UserLoginDTO {
        @NotNull
        @Size(min = 2, max = 50)
        @Email
        String email;
        @NotNull
        @Size(min = 2, max = 20)
        String password;
        String firstName;

        public String getEmail() {
                return email;
        }

        public UserLoginDTO setEmail(String email) {
                this.email = email;
                return this;
        }

        public String getPassword() {
                return password;
        }

        public UserLoginDTO setPassword(String password) {
                this.password = password;
                return this;
        }

        public String getFirstName() {
                return firstName;
        }

        public UserLoginDTO setFirstName(String firstName) {
                this.firstName = firstName;
                return this;
        }
}
