package com.oikos.api.exceptions;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class OikosExceptionHandler {

    @ExceptionHandler(OikosException.class)
    public OikosErrorResponse handleOikosException(OikosException ex) {
        return OikosErrorResponse.builder()
                .codigo(ex.getCodigo())
                .timestamp(java.time.LocalDateTime.now())
                .build();
    }
}
