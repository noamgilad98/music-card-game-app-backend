package com.musiccardgame.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class SpotifyConfig {
    private String clientId = "your_spotify_client_id";
    private String clientSecret = "your_spotify_client_secret";
    private String redirectUri = "your_redirect_uri";

    // Getters and Setters
    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public String getRedirectUri() {
        return redirectUri;
    }

    public void setRedirectUri(String redirectUri) {
        this.redirectUri = redirectUri;
    }
}