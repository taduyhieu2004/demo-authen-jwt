package com.example.demo_authen_jwt.dto.request.authenticate;


import com.example.demo_authen_jwt.exception.authenticate.PasswordNotNullException;
import com.example.demo_authen_jwt.exception.authenticate.UsernameNotNullException;

public record LoginRequest(String username, String password) {
  public LoginRequest {
    if (username == null || username.isBlank()) {
      throw new UsernameNotNullException();
    }
    if (password == null || password.isBlank()) {
      throw new PasswordNotNullException();
    }
  }
}