package com.iki.backend.service;

import com.iki.backend.model.dtos.SignupRequest;
import org.springframework.http.ResponseEntity;

public interface UserService {

    ResponseEntity<?> registerUser(SignupRequest request);
    ResponseEntity<?> findUserById(Long userId);

    ResponseEntity<?> getAllUsers();

}
