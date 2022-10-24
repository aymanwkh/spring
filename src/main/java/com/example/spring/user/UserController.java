package com.example.spring.user;

import java.util.List;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("api/user")
@AllArgsConstructor
public class UserController {
  private final UserService userService;

  @PreAuthorize("hasRole('ROLE_USER')")
  @GetMapping
	public List<User> getUsers() {
		return userService.getUsers();
	}

  @PostMapping
  public User saveUser(@RequestBody User user) {
    return userService.createUser(user);
  }

  @DeleteMapping(path = "{id}")
  public void deleteUser(@PathVariable("id") Long id) {
    userService.deleteUser(id);
  }
}
