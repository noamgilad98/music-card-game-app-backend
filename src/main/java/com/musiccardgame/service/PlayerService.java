package com.musiccardgame.service;

import com.musiccardgame.dao.PlayerDAO;
import com.musiccardgame.dto.PlayerDTO;
import com.musiccardgame.model.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {

    @Autowired
    private PlayerDAO playerDAO;

    public PlayerDTO getPlayerById(String playerId) {
        Player player = playerDAO.findById(playerId).orElse(null);
        if (player != null) {
            PlayerDTO playerDTO = new PlayerDTO();
            playerDTO.setPlayerId(player.getPlayerId());
            playerDTO.setPlayerName(player.getPlayerName());
            return playerDTO;
        }
        return null;
    }

    // Other service methods
}