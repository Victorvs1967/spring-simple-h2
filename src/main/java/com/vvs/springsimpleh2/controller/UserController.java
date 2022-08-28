package com.vvs.springsimpleh2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vvs.springsimpleh2.model.User;
import com.vvs.springsimpleh2.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {
  
  @Autowired
  private UserService userService;

  @GetMapping("/users")
  public List<User> getAllUsers() {
    return userService.getUsers();
  }

  @PostMapping("/users")
  public User createUser(@RequestBody User user) {
    return userService.addUser(user);
  }
}
