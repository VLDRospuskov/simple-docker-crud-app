package com.vldrospuskov.simpledockercrudapp.service;

import com.vldrospuskov.simpledockercrudapp.dao.UserRepository;
import com.vldrospuskov.simpledockercrudapp.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

}