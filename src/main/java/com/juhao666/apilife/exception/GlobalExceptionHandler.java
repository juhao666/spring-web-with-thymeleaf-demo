package com.juhao666.apilife.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * to handle all web controller exception
 */
@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(value = {ArithmeticException.class, NullPointerException.class})
    // handle these kinds of exception
    public String handler(Exception e) {
        log.error("Exception is {}", e);
        return "pages-login"; // view address

    }
}
