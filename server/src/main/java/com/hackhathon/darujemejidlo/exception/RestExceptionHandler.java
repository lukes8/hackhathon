package com.hackhathon.darujemejidlo.exception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import lombok.NonNull;

/**
 * Handler to map basic kinds of exception to a ResponseEntity with adequate HTTP return code.
 */
@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler({ EmailNotValidException.class })
    protected final ResponseEntity<Object> handleValidationError(
            @NonNull RuntimeException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.ALREADY_REPORTED);
    }
}

