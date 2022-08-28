package com.vvs.springsimpleh2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vvs.springsimpleh2.model.User;
import com.vvs.springsimpleh2.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

  @Autowired
  private UserRepository userRepository;
  
  @Override
  public List<User> getUsers() {
    return userRepository.findAll();
  }

  @Override
  public User addUser(User user) {
    return userRepository.save(user);
  }
  

}
