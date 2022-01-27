package com.laioffer.staybooking.exception;

public class StayDeleteException extends RuntimeException {
    public StayDeleteException(String message) {
        super(message); //支持显示错误消息的method
    }
}
