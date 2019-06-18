package com.tobias.exception;

public class CustomException extends RuntimeException {

  public CustomException(String message, Exception e, boolean writableStackTrace) {
    super(message, e, true, writableStackTrace);
  }

}
