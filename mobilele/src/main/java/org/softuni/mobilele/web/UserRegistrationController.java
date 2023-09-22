package org.softuni.mobilele.web;

import org.softuni.mobilele.model.dto.UserRegistrationDTO;
import org.softuni.mobilele.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/users")
@Controller
public class UserRegistrationController {
  private final UserService userService;

  public UserRegistrationController(UserService userService) {
    this.userService = userService;
  }

  @GetMapping("/register")
  public String register() {
    return "auth-register";
  }

  @PostMapping("/register")
  public String register(UserRegistrationDTO userRegistrationDTO) {
    // TODO: Registration email with activation link
    // TODO: Validation of data, currently this code needs to be replace with better one.
    if (userRegistrationDTO.firstName() == null || userRegistrationDTO.firstName().trim().isEmpty() ||
        userRegistrationDTO.lastName() == null || userRegistrationDTO.lastName().trim().isEmpty() ||
        userRegistrationDTO.email() == null || userRegistrationDTO.email().trim().isEmpty() ||
        userRegistrationDTO.password() == null || userRegistrationDTO.password().trim().isEmpty() ||
        userRegistrationDTO.confirmPassword() == null || userRegistrationDTO.confirmPassword().trim().isEmpty()) {
      return "redirect:/users/register";
    } else if (!userRegistrationDTO.password().equals(userRegistrationDTO.confirmPassword())) {
      return "redirect:/users/register";
    }
    userService.registerUser(userRegistrationDTO);
    return "redirect:/";
  }


}
