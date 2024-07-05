package com.musiccardgame.dao;

import com.musiccardgame.model.Card;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardDAO extends CrudRepository<Card, String> {
    // Custom query methods can be defined here
}