package com.theironyard;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by hoseasandstrom on 6/21/16.
 */
public interface UserRepository extends CrudRepository<User, Integer> {
    public User findByUsername(String username);
}
