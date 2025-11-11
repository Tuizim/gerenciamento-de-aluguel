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
        .name(entity.getName())
        .username(entity.getUsername())
        .email(entity.getEmail())
        .phone(entity.getPhone())
        .active(entity.getActive())
        .create_at(entity.getCreatedAt())
        .update_at(entity.getUpdatedAt())
        .role(entity.getRole().getDescription())
        .build();
    }

    public UserUpdateDTO entityToUpdateDto(User entity) {
        return UserUpdateDTO.builder().build();
    }
}
