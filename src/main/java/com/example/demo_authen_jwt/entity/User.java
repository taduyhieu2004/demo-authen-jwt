package com.example.demo_authen_jwt.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class User {
  @Id
  private String id;
  private String username;
  private String password;
  private String fullName;
  private String email;

  public User(String username, String password, String fullName, String email) {
    this.id = UUID.randomUUID().toString();
    this.username = username;
    this.password = password;
    this.fullName = fullName;
    this.email = email;
  }
}
