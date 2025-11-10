package com.oikos.api.dto.authentication;

import com.oikos.api.entity.User;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.UUID;

@Component
public class RegisterConverter {
    public User registerToUser(RegisterDto registerDto){
        return User.builder()
                .login(registerDto.login())
                .uuid(UUID.randomUUID())
                .senhaHash(registerDto.password())
                .tipoUsuario(registerDto.role())
                .ativo(true)
                .email(registerDto.email())
                .telefone(registerDto.telefone())
                .nome(registerDto.nome())
                .dataAtualizacao(LocalDateTime.now())
                .dataCriacao(LocalDateTime.now())
                .build();
    }
}
