package org.softuni.mobilele.web;

import jakarta.servlet.http.HttpServletRequest;
import org.softuni.mobilele.model.dto.UserLoginDTO;
import org.softuni.mobilele.model.entity.UserEntity;
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
  public String login() {
    return "auth-login";
  }
  @PostMapping("/login")
  public String login(UserLoginDTO userLoginDTO, HttpServletRequest request) {
    //TODO: Change UserEntity to be UserDTO in order to not expose all the field that UserEntity have.
    UserEntity login = userService.login(userLoginDTO);
    request.getSession().setAttribute("user", UserEntity.class);
    return "redirect:/";
  }
}
