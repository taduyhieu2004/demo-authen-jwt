package com.example.demo_authen_jwt.exception.authenticate;


import com.example.demo_authen_jwt.exception.base.BadRequestException;

public class WrongPasswordException extends BadRequestException {
  public WrongPasswordException(){
    super("com.cyai.cms.exception.authenticate.WrongPasswordException");
  }
}
