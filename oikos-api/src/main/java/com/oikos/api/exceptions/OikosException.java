package com.oikos.api.exceptions;

public class OikosException extends RuntimeException {
    private final String codigo;

    public OikosException(String codigo) {
        super(codigo);
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }
}
