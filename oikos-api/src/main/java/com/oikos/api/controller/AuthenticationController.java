package com.oikos.api.controller;

import com.oikos.api.dto.authentication.AuthenticationDto;
import com.oikos.api.dto.authentication.LoginResponseDto;
import com.oikos.api.dto.authentication.RegisterConverter;
import com.oikos.api.dto.authentication.RegisterDto;
import com.oikos.api.entity.User;
import com.oikos.api.exceptions.OikosErrorCatalog;
import com.oikos.api.exceptions.OikosException;
import com.oikos.api.infra.security.TokenService;
import com.oikos.api.repository.UserRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("api/auth")
public class AuthenticationController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RegisterConverter registerConverter;

    @Autowired
    private TokenService tokenService;

    @PostMapping("/login")
    public ResponseEntity login(@RequestBody @Valid AuthenticationDto data){
        var usernamePassword = new UsernamePasswordAuthenticationToken(data.login(),data.password());

        var auth = authenticationManager.authenticate(usernamePassword);

        String token = tokenService.generateToken((User) auth.getPrincipal());
        return ResponseEntity.ok(new LoginResponseDto(token));
    }

    @PostMapping("/register")
    public ResponseEntity register(@RequestBody @Valid RegisterDto dto){
        if(userRepository.findByLogin(dto.login()) != null){
            throw new RuntimeException(
                new OikosException(OikosErrorCatalog.USUARIO_LOGIN_JA_REGISTRADO)
            );
        }
        String encryptedPassword = new BCryptPasswordEncoder().encode(dto.password());
        User newUser = registerConverter.registerToUser(dto);
        newUser.setSenhaHash(encryptedPassword);
        this.userRepository.save(newUser);
        return ResponseEntity.ok().build();
    }
}
