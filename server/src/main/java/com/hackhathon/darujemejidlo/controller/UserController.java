package com.hackhathon.darujemejidlo.controller;

import com.hackhathon.darujemejidlo.exception.UniqueUserException;
import com.hackhathon.darujemejidlo.persistence.entity.User;
import com.hackhathon.darujemejidlo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity getAllUsers() {
        return ResponseEntity.ok(userService.getAllUsers());
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable("id") long id) {
        User user = userService.getUserById(id);

        return (user == null) ?
                ResponseEntity.notFound().build() : ResponseEntity.ok(user);
    }

    @PostMapping
    public ResponseEntity<?> addUser(@Validated @RequestBody User user) throws UniqueUserException {
        return ResponseEntity.ok(userService.addUser(user));
    }
}
