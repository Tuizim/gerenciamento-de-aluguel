package com.oikos.api.dto.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserCreateDTO {
    private String nome;
    private String email;
    private String senha;
    private String telefone;
    private String tipoUsuario;
}
