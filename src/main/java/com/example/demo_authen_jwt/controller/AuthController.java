package com.example.demo_authen_jwt.controller;

import com.example.demo_authen_jwt.dto.request.authenticate.LoginRequest;
import com.example.demo_authen_jwt.dto.request.authenticate.RefreshTokenRequest;
import com.example.demo_authen_jwt.dto.response.ResponseGeneral;
import com.example.demo_authen_jwt.dto.response.authenticate.LoginResponse;
import com.example.demo_authen_jwt.facade.AuthenticateFacadeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.example.demo_authen_jwt.constant.AuthConstant.MessageException.SUCCESS;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/auth")
public class AuthController {
  private final AuthenticateFacadeService authenticateFacadeService;

  @PostMapping("/login")
  public ResponseGeneral<LoginResponse> login(
        @RequestBody LoginRequest request
  ) {

    return ResponseGeneral.ofSuccess(
          SUCCESS,
          authenticateFacadeService.login(request));
  }

  @PostMapping("/refresh")
  public ResponseGeneral<LoginResponse> refresh(
        @RequestBody RefreshTokenRequest request
  ) {

    return ResponseGeneral.ofSuccess(
          SUCCESS,
          authenticateFacadeService.refreshToken(request));
  }

}
