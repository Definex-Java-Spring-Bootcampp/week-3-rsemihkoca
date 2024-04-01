package com.rsemihkoca.userservicemain.controller;


import com.rsemihkoca.userservicemain.model.User;
import com.rsemihkoca.userservicemain.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/onlinealisveris/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    public User createUser(@RequestBody User request) {
        return userService.createUser(request);
    }

    @GetMapping
    public ResponseEntity<List<User>> getAll() {
        return ResponseEntity.ok(userService.getAll());
    }

    @GetMapping("errorTest")
    public ResponseEntity<List<User>> testKafka() {
        throw new RuntimeException("test exception");
    }

}
