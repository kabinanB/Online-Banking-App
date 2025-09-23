package com.banking.banking_app.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banking.banking_app.entity.User;
import com.banking.banking_app.repository.UserRepository;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository)
    {
        this.userRepository = userRepository;
    }

    @PostMapping
    public User createUser(@RequestBody User user)
    {
        return userRepository.save(user);
    }

    @GetMapping
    public List<User> getUsers()
    {
        return userRepository.findAll();
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userRepository.deleteById(id);
    }
}
