package com.musiccardgame.service;

import com.musiccardgame.dto.UserDTO;
import com.musiccardgame.model.User;
import com.musiccardgame.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserDTO register(UserDTO userDTO) {
        User user = new User();
        user.setUserId(UUID.randomUUID().toString());
        user.setUsername(userDTO.getUsername());
        user.setPassword(userDTO.getPassword());
        user.setEmail(userDTO.getEmail());
        userRepository.save(user);

        userDTO.setUserId(user.getUserId());
        return userDTO;
    }

    public UserDTO login(String username, String password) {
        User user = userRepository.findByUsername(username);
        if (user != null && user.getPassword().equals(password)) {
            UserDTO userDTO = new UserDTO();
            userDTO.setUserId(user.getUserId());
            userDTO.setUsername(user.getUsername());
            userDTO.setEmail(user.getEmail());
            return userDTO;
        }
        return null;
    }

    // Other service methods...
}