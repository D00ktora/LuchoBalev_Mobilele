package org.softuni.mobilele.web;

import jakarta.validation.Valid;
import org.softuni.mobilele.model.dto.UserRegistrationDTO;
import org.softuni.mobilele.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@RequestMapping("/users")
@Controller
public class UserRegistrationController {
  private final UserService userService;

  public UserRegistrationController(UserService userService) {
    this.userService = userService;
  }

  @ModelAttribute("userModel")
  public void initialiseUserModel(Model model) {
    model.addAttribute("userModel", new UserRegistrationDTO());
  }

  @GetMapping("/register")
  public String register() {
    return "auth-register";
  }

  @PostMapping("/register")
  public String register(@Valid UserRegistrationDTO userRegistrationDTO, BindingResult bindingResult, RedirectAttributes redirectAttributes) {

    // TODO: Registration email with activation link
    if (bindingResult.hasErrors() || (!userRegistrationDTO.getPassword().equals(userRegistrationDTO.getConfirmPassword()))) {
      redirectAttributes.addFlashAttribute("userModel", userRegistrationDTO);
      redirectAttributes.addFlashAttribute("org.springframework.validation.BindingResult.userModel", bindingResult);
      return "redirect:/users/register";
    }

    userService.registerUser(userRegistrationDTO);
    return "redirect:/";
  }


}
