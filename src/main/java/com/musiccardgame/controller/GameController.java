package com.musiccardgame.controller;

import com.musiccardgame.dto.GameDTO;
import com.musiccardgame.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/game")
public class GameController {

    @Autowired
    private GameService gameService;

    @PostMapping("/start")
    public GameDTO startGame(@RequestParam int numOfPlayers) {
        return gameService.startGame(numOfPlayers);
    }

    @PostMapping("/nextTurn")
    public void nextTurn(@RequestParam String gameId) {
        gameService.nextTurn(gameId);
    }

    // Other endpoints...
}