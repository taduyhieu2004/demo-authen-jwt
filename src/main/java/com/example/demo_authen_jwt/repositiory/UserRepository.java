package com.example.demo_authen_jwt.repositiory;

import com.example.demo_authen_jwt.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
