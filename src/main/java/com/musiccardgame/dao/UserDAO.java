package com.musiccardgame.dao;

import com.musiccardgame.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO extends CrudRepository<User, String> {
    // Custom query methods can be defined here
}