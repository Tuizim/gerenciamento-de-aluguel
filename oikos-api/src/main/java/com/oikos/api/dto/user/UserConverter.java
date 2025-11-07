package com.oikos.api.dto.user;

import com.oikos.api.entity.User;

public class UserConverter {
    public User createDtoToEntity(UserCreateDTO dto) {
        return User.builder().build();
    }

    public User responseDtoToEntity(UserResponseDTO dto) {
        return User.builder().build();
    }

    public User updateDtoToEntity(UserUpdateDTO dto) {
        return User.builder().build();
    }

    public UserCreateDTO entityToCreateDto(User entity) {
        return UserCreateDTO.builder().build();
    }

    public UserResponseDTO entityToResponseDto(User entity) {
        return UserResponseDTO.builder()
        .uuid(entity.getUuid())
        .nome(entity.getNome())
        .email(entity.getEmail())
        .telefone(entity.getTelefone())
        .ativo(entity.getAtivo())
        .dataCriacao(entity.getDataCriacao())
        .dataAtualizacao(entity.getDataAtualizacao())
        .build();
    }

    public UserUpdateDTO entityToUpdateDto(User entity) {
        return UserUpdateDTO.builder().build();
    }
}
