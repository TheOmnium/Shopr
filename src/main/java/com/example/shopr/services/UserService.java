package com.example.shopr.services;

import com.example.shopr.domain.User;
import com.example.shopr.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAllUsers() {
        return userRepository.findAllUsers();
    }

    public void updateUser(User updatedUser) {
        userRepository.updateUser(updatedUser);
    }
}
