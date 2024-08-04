package com.example.demo_authen_jwt.repositiory;

import com.example.demo_authen_jwt.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, String> {

  @Query("""
        SELECT u FROM User u WHERE u.username = :username
        """)
  Optional<User> findByUsername(String username);
}
