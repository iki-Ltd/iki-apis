package com.iki.backend.controller;

import com.iki.backend.model.dtos.SignupRequest;
import com.iki.backend.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/user")
public class UserController {

    private final UserService userService;

    @RequestMapping(value = "/signup", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<?> registerUser(@Valid @RequestBody SignupRequest request){
        return userService.registerUser(request);
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<?> findUserById(@RequestParam Long userId){
        return userService.findUserById(userId);
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<?> getAllUsers(){
        return userService.getAllUsers();
    }

}
