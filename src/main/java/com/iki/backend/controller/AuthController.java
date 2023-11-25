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

    @RequestMapping(value = "/signup", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<?> registerUser(@Valid @RequestBody SignupRequest request){
        return authService.registerUser(request);
    }

    @RequestMapping(value = "/signin", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest request){
        return authService.authenticateUser(request);
    }


}
