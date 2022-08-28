package com.vvs.springsimpleh2.service;

import java.util.List;

import com.vvs.springsimpleh2.model.User;

public interface UserService {
  public List<User> getUsers();
  public User addUser(User user);
}
