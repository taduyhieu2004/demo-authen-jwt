package com.example.demo_authen_jwt.service.impl;

import com.example.demo_authen_jwt.dto.request.UserRequest;
import com.example.demo_authen_jwt.dto.response.UserResponse;
import com.example.demo_authen_jwt.entity.User;
import com.example.demo_authen_jwt.repositiory.UserRepository;
import com.example.demo_authen_jwt.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
  private final UserRepository repository;
  @Override
  public UserResponse create(UserRequest request) {

    final User user = toEntity(request);
    final User userSaved = repository.save(user);

    return toResponse(userSaved);
  }

  @Override
  public UserResponse detail(String id) {

    return toResponse(this.find(id));
  }

  private User toEntity(UserRequest request){
    return new User(
          request.username(),
          request.password(),
          request.fullName(),
          request.email()
    );
  }

  private UserResponse toResponse(User user){
    return new UserResponse(
          user.getId(),
          user.getUsername(),
          user.getFullName(),
          user.getEmail()
    );
  }

  private User find(String id) {
    return repository.findById(id).orElseThrow(() -> new IllegalArgumentException("User not found"));
  }
}