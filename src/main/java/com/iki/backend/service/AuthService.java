package com.iki.backend.service;

import com.iki.backend.model.dtos.LoginRequest;
import org.springframework.http.ResponseEntity;

public interface AuthService {
    ResponseEntity<?> authenticateUser(LoginRequest request);

}
