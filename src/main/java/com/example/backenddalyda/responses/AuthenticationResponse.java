package com.example.backenddalyda.responses;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
// type string that will contain the login token
public class AuthenticationResponse {
    String token;
}
