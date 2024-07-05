package com.musiccardgame.repository;

import com.musiccardgame.model.Game;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends CrudRepository<Game, String> {
    // Custom query methods can be defined here
}