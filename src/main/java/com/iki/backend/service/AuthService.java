package com.iki.backend.service;

import com.iki.backend.model.dtos.LoginRequest;
import com.iki.backend.model.dtos.SignupRequest;
import org.springframework.http.ResponseEntity;

public interface AuthService {


    ResponseEntity<?> authenticateUser(LoginRequest request);


    ResponseEntity<?> getAllUsers();

}
