
package com.musiccardgame.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Card {
    @Id
    private String id;
    private String songName;
    private String artist;
    private int year;
    private String spotifyTrackUrl;
    private boolean isFaceUp;

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
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

    public boolean isFaceUp() {
        return isFaceUp;
    }

    public void setFaceUp(boolean faceUp) {
        isFaceUp = faceUp;
    }
}