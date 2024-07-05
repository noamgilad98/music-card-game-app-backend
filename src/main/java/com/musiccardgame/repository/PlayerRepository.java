package com.musiccardgame.repository;

import com.musiccardgame.model.Player;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends CrudRepository<Player, String> {
    // Custom query methods can be defined here
}