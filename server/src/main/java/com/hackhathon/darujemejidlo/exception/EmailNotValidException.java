package com.hackhathon.darujemejidlo.exception;

import lombok.Getter;
import lombok.NonNull;

@Getter
public class EmailNotValidException extends RuntimeException {

    public EmailNotValidException(@NonNull String email) {
        super(String.format("E-mail '%s' invalid format.", email));
    }
}
