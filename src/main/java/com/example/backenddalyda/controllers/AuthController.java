package com.example.backenddalyda.controllers;


import com.example.backenddalyda.responses.AuthenticationResponse;
import com.example.backenddalyda.services.UserService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import com.example.backenddalyda.dto.UserDto.LoginDto;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/auth")
@Validated
// auth controller no authorisation or authentication needed to access these endpoints
public class AuthController {

    // service class importing
    private final UserService userService;

    // login endpoint
    @PostMapping("/login")
    public ResponseEntity<AuthenticationResponse> login(@Valid @RequestBody LoginDto loginDto) {
        var message = userService.logIn(loginDto);
        return ResponseEntity.ok(message);
    }
}
