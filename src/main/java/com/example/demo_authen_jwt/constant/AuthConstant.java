package com.example.demo_authen_jwt.constant;

public class AuthConstant {

  public static class MessageException {
    private MessageException() {
    }

    public static final String DEFAULT_CODE_BAD_REQUEST = "com.cyai.cms.exception.base.BadRequestException";
    public static final String DEFAULT_CODE_CONFLICT = "com.cyai.cms.exception.base.ConflictException";
    public static final String DEFAULT_CODE_NOTFOUND = "com.cyai.cms.exception.base.NotFoundException";
    public static final String DEFAULT_CODE_SERVER_ERROR = "com.cyai.cms.exception.base.InternalServerError";
    public static final String NOT_FOUND_MESSAGE = "Not found";
    public static final String BAD_REQUEST_MESSAGE = "Bad request";
    public static final String CONFLICT_MESSAGE = "Conflict occurred";
    public static final String BLANK_MESSAGE = "";
    public static final String SUCCESS = "success";
    public static final String LANGUAGE = "Accept-Language";
    public static final String DEFAULT_LANGUAGE = "en";
  }

  public static class JwtConstant {
    private JwtConstant() {
    }
    public static final String BEARER_TOKEN_TYPE_START = "Bearer ";

  }
}
