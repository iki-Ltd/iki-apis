package com.iki.backend.controller;

import com.iki.backend.model.dtos.LoginRequest;
import com.iki.backend.model.dtos.SignupRequest;
import com.iki.backend.service.AuthService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/auth")
public class AuthController {

    private final AuthService authService;

    @RequestMapping(value = "/signin", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest request){
        return authService.authenticateUser(request);
    }


    @RequestMapping(value = "/users", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<?> getAllUsers(){
        return authService.getAllUsers();
    }
}
