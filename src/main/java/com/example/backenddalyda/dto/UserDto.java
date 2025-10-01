package com.example.backenddalyda.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class UserDto {
    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    // Login DTO, data for Logging in
    public static class LoginDto {
        @Email(message="Invalid Email Format")
        @NotBlank(message="Email is Required")
        private String email;

        @NotBlank(message="Password is Required")
        private String password;
    }
}
