package com.test.mmm.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.test.mmm.entity.Users;

/**
 * Created by Marian_Mykhalchuk on 9/9/2015.
 */
@Component
public interface UsersRepository extends CrudRepository<Users, Integer> {
    List<Users> findByLogin(String login);
}
