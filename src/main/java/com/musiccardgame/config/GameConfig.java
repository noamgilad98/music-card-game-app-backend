package com.musiccardgame.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class GameConfig {
    private int minPlayers = 2;
    private int maxPlayers = 4;
    private int cardsToWin = 10;

    // Getters and Setters
    public int getMinPlayers() {
        return minPlayers;
    }

    public void setMinPlayers(int minPlayers) {
        this.minPlayers = minPlayers;
    }

    public int getMaxPlayers() {
        return maxPlayers;
    }

    public void setMaxPlayers(int maxPlayers) {
        this.maxPlayers = maxPlayers;
    }

    public int getCardsToWin() {
        return cardsToWin;
    }

    public void setCardsToWin(int cardsToWin) {
        this.cardsToWin = cardsToWin;
    }
}