package org.softuni.mobilele.model.dto;

import jakarta.validation.constraints.NotNull;

public record UserRegistrationDTO(
        @NotNull
        String firstName,
        @NotNull
        String lastName,
        @NotNull
        String email,
        @NotNull
        String password,
        @NotNull
        String confirmPassword) {
}
