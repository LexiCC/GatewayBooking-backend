package com.laioffer.staybooking.exception;

// throw UserNotExist exception when the given user credential is invalid.
public class UserNotExistException extends RuntimeException {
    public UserNotExistException(String message) {
        super(message);
    }
}
