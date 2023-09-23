package org.softuni.mobilele.model.dto;

import jakarta.validation.constraints.NotNull;

public record UserLoginDTO(
        @NotNull
        String email,
        @NotNull
        String password,
        String firstName) {
}
