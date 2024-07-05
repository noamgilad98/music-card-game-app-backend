package com.musiccardgame.controller;

import com.musiccardgame.dto.UserDTO;
import com.musiccardgame.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public UserDTO register(@RequestBody UserDTO userDTO) {
        return userService.register(userDTO);
    }

    @PostMapping("/login")
    public UserDTO login(@RequestParam String username, @RequestParam String password) {
        return userService.login(username, password);
    }

    // Other endpoints...
}