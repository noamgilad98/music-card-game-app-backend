package com.musiccardgame.dao;

import com.musiccardgame.model.Game;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameDAO extends CrudRepository<Game, String> {
    // Custom query methods can be defined here
}