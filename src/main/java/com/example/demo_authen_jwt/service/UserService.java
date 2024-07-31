package com.example.demo_authen_jwt.service;

import com.example.demo_authen_jwt.dto.request.UserRequest;
import com.example.demo_authen_jwt.dto.response.UserResponse;

public interface UserService {
  UserResponse create(UserRequest request);

  UserResponse detail(String id);




}
