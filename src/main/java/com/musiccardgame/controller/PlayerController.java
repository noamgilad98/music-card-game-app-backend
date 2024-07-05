package com.musiccardgame.controller;

import com.musiccardgame.dto.PlayerDTO;
import com.musiccardgame.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/player")
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @GetMapping("/{id}")
    public PlayerDTO getPlayerById(@PathVariable String id) {
        return playerService.getPlayerById(id);
    }

    // Other endpoints...
}