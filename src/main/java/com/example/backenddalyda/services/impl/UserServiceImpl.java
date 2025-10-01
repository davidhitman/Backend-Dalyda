package com.example.backenddalyda.services.impl;

import com.example.backenddalyda.dto.UserDto.LoginDto;
import com.example.backenddalyda.entities.Users;
import com.example.backenddalyda.responses.AuthenticationResponse;
import com.example.backenddalyda.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final AuthenticationManager authenticationManager;
    private final JwtService jwtService;

    // login function
    @Override
    public AuthenticationResponse logIn(LoginDto loginDto) {
        // authenticate the login credentials
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(loginDto.getEmail(), loginDto.getPassword()));
        Users user = (Users) authentication.getPrincipal(); //  get the user from user details, after authenticating
        var token = jwtService.generateToken(user);
        return AuthenticationResponse.builder().token(token).build();
    }
}
