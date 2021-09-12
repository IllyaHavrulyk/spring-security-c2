package com.havruyk.springsecurityc2.Repositories;

import com.havruyk.springsecurityc2.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Entity;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findUserByUsername(String username);
}
