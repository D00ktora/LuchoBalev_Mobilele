package org.softuni.mobilele.repository;

import org.softuni.mobilele.model.entity.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<UserRole, Long> {
    Optional<UserRole> getAllById(Long id);
}
