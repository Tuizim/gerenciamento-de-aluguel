package com.oikos.api.enums;

import lombok.Getter;

@Getter
public enum TipoUsuario {
    PROPRIETARIO("Proprietário"),
    INQUILINO("Inquilino"),
    ADMIN("Administrador");
    private final String descricao;
    TipoUsuario(String descricao) {
        this.descricao = descricao;
    }
}