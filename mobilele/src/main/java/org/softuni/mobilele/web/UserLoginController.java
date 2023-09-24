package org.softuni.mobilele.web;
;
import jakarta.servlet.http.HttpSession;
import org.softuni.mobilele.model.dto.LoggedUserDTO;
import org.softuni.mobilele.model.dto.UserLoginDTO;
import org.softuni.mobilele.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UserLoginController {
  public final UserService userService;

  public UserLoginController(UserService userService) {
    this.userService = userService;
  }

  @GetMapping("/login")
  public String login(HttpSession session) {
    return "auth-login";
  }

  @PostMapping("/login")
  public String login(UserLoginDTO userLoginDTO, HttpSession session) {
    boolean login = userService.login(userLoginDTO);
    return "redirect:/";
  }

  @GetMapping("/logout")
  private String logout() {
    userService.logout();
    return "redirect:/";
  }
}
