package com.example.backenddalyda.services;

import com.example.backenddalyda.dto.UserDto.LoginDto;
import com.example.backenddalyda.responses.AuthenticationResponse;

public interface UserService {
    // login service implementation
    AuthenticationResponse logIn(LoginDto loginDto);
}
