 package com.musiccardgame.dao;

import com.musiccardgame.model.Player;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerDAO extends CrudRepository<Player, String> {
    // Custom query methods can be defined here
}