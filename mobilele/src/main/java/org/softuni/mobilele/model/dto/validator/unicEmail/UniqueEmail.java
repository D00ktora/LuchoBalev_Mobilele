package org.softuni.mobilele.model.dto.validator.unicEmail;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.softuni.mobilele.repository.UserRepository;

public class UniqueEmail implements ConstraintValidator<EmailValidator, String> {

    private final UserRepository userRepository;

    public UniqueEmail(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return userRepository.getByEmail(value).isEmpty();
    }
}
