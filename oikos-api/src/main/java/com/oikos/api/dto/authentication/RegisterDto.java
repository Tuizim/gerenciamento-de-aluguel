package com.oikos.api.dto.authentication;

import com.oikos.api.enums.TipoUsuario;

public record RegisterDto(
        String nome,
        String email,
        String password,
        String telefone,
        TipoUsuario role,
        String login
) {
}
