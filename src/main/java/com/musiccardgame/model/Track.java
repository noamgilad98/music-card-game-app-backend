package com.musiccardgame.model;

public class Track {
    private String trackId;
    private String trackName;
    private String artist;
    private int year;
    private String spotifyTrackUrl;

    // Getters and Setters
    public String getTrackId() {
        return trackId;
    }

    public void setTrackId(String trackId) {
        this.trackId = trackId;
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getSpotifyTrackUrl() {
        return spotifyTrackUrl;
    }

    public void setSpotifyTrackUrl(String spotifyTrackUrl) {
        this.spotifyTrackUrl = spotifyTrackUrl;
    }
}