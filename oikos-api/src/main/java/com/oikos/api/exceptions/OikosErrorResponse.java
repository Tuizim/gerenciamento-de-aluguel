package com.oikos.api.exceptions;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OikosErrorResponse {
    private String codigo;
    private LocalDateTime timestamp;
}
