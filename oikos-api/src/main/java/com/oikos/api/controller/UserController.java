package com.oikos.api.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oikos.api.dto.user.UserResponseDTO;
import com.oikos.api.services.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{uuid}")
    public UserResponseDTO findByUuid(@PathVariable UUID uuid) {
        return userService.findDtoByUuid(uuid);
    }
}
