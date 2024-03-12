package dev.vasilev.vkinternship.service;

import dev.vasilev.vkinternship.auth.AuthRequest;
import dev.vasilev.vkinternship.auth.AuthResponse;
import dev.vasilev.vkinternship.auth.RegisterRequest;

public interface AuthenticationService {
    AuthResponse register(RegisterRequest registerRequest);
    AuthResponse authenticate(AuthRequest request);
}
