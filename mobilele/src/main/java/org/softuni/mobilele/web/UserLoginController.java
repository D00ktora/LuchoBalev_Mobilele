package org.softuni.mobilele.web;
;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import org.softuni.mobilele.model.dto.LoggedUserDTO;
import org.softuni.mobilele.model.dto.UserLoginDTO;
import org.softuni.mobilele.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/users")
public class UserLoginController {
  public final UserService userService;

  public UserLoginController(UserService userService) {
    this.userService = userService;
  }

  @ModelAttribute("userModel")
  public void initialisationUserModel(Model model) {
    model.addAttribute("userModel", new UserLoginDTO());
  }

  @GetMapping("/login")
  public String login(HttpSession session) {
    return "auth-login";
  }

  @PostMapping("/login")
  public String login(@Valid UserLoginDTO userLoginDTO, BindingResult bindingResult, RedirectAttributes redirectAttributes) {

    if (bindingResult.hasErrors()) {
      redirectAttributes.addFlashAttribute("userModel", userLoginDTO);
      redirectAttributes.addFlashAttribute("org.springframework.validation.BindingResult.userModel", bindingResult);
      return "redirect:/users/login";
    }

    boolean login = userService.login(userLoginDTO);
    return "redirect:/";
  }

  @GetMapping("/logout")
  private String logout() {
    userService.logout();
    return "redirect:/";
  }
}
