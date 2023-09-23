package org.softuni.mobilele.service.impl;

import org.modelmapper.ModelMapper;
import org.softuni.mobilele.model.dto.LoggedUserDTO;
import org.softuni.mobilele.model.dto.UserLoginDTO;
import org.softuni.mobilele.model.dto.UserRegistrationDTO;
import org.softuni.mobilele.model.entity.UserEntity;
import org.softuni.mobilele.model.entity.UserRole;
import org.softuni.mobilele.repository.UserRepository;
import org.softuni.mobilele.service.RoleService;
import org.softuni.mobilele.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

  private final UserRepository userRepository;
  private final RoleService roleService;
  private final PasswordEncoder passwordEncoder;
  private final ModelMapper modelMapper;
@Autowired
  public UserServiceImpl(
          UserRepository userRepository,
          RoleService roleService, PasswordEncoder passwordEncoder, ModelMapper modelMapper) {
    this.userRepository = userRepository;
    this.roleService = roleService;
    this.passwordEncoder = passwordEncoder;
    this.modelMapper = modelMapper;
  }

  @Override
  public void registerUser(UserRegistrationDTO userRegistrationDTO) {
    UserEntity newUser = map(userRegistrationDTO);
    UserRole userRole = new UserRole();

    if (userRepository.count() > 0) {
      userRole = this.roleService.getUserRole(2L);
    } else {
      userRole = this.roleService.getUserRole(1L);
    }

    newUser.setRole(userRole)
            .setCreated(LocalDateTime.now())
            .setModified(LocalDateTime.now());

    userRepository.save(newUser);
  }

  @Override
  public LoggedUserDTO login(UserLoginDTO loginDTO) {
    Optional<UserEntity> optionalUserEntity = userRepository.getByEmail(loginDTO.email());
    UserEntity user = new UserEntity();
    boolean passwordMatcher = false;

    if (optionalUserEntity.isPresent()) {
      user = optionalUserEntity.get();
      passwordMatcher = passwordEncoder.matches(loginDTO.password(), user.getPassword());
    } else {
      user = null;
    }

    if (user != null && passwordMatcher) {
      LoggedUserDTO loggedUser = modelMapper.map(user, LoggedUserDTO.class);
      return loggedUser;
    }
    return null;
  }

  private UserEntity map(UserRegistrationDTO userRegistrationDTO) {
    return new UserEntity()
        .setActive(true)
        .setFirstName(userRegistrationDTO.firstName())
        .setLastName(userRegistrationDTO.lastName())
        .setEmail(userRegistrationDTO.email())
        .setPassword(passwordEncoder.encode(userRegistrationDTO.password()));
  }
}
