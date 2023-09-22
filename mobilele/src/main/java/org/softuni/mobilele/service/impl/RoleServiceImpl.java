package org.softuni.mobilele.service.impl;

import org.softuni.mobilele.model.entity.UserRole;
import org.softuni.mobilele.repository.RoleRepository;
import org.softuni.mobilele.service.RoleService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RoleServiceImpl implements RoleService {
    private final RoleRepository roleRepository;

    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }
    public UserRole getUserRole(Long id) {
        Optional<UserRole> role = this.roleRepository.getAllById(id);
        return role.orElse(null);
    }
}
