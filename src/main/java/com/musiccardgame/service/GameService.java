package com.musiccardgame.service;

import com.musiccardgame.dto.GameDTO;
import com.musiccardgame.model.Game;
import com.musiccardgame.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public GameDTO startGame(int numOfPlayers) {
        Game game = new Game();
        game.setGameId(UUID.randomUUID().toString());
        game.setMaxCards(10);
        gameRepository.save(game);

        // Convert Game to GameDTO
        GameDTO gameDTO = new GameDTO();
        gameDTO.setGameId(game.getGameId());
        gameDTO.setMaxCards(game.getMaxCards());
        return gameDTO;
    }

    public void nextTurn(String gameId) {
        // Implement next turn logic
    }

    // Other service methods...
}