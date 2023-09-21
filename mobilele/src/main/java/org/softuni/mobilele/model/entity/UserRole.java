package org.softuni.mobilele.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import org.softuni.mobilele.model.entity.enums.Role;


@Entity
@Table(name = "roles")
public class UserRole extends BaseEntity {
    @NotNull

    private String name;

    public String getName() {
        return name;
    }

    public UserRole setName(String name) {
        this.name = name;
        return this;
    }
}
