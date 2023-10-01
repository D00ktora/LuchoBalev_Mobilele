package org.softuni.mobilele.model.dto.validator.passwordValidator;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import org.softuni.mobilele.model.dto.validator.unicEmail.UniqueEmail;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Constraint(validatedBy = ConfirmPassword.class)
public @interface PasswordValidator {
    String first();
    String second();
    String message() default "Invalid Email";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
