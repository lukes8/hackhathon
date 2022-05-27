package com.hackhathon.darujemejidlo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hackhathon.darujemejidlo.exception.UniqueLoginException;
import com.hackhathon.darujemejidlo.persistence.entity.Login;
import com.hackhathon.darujemejidlo.service.LoginService;

@RestController
@RequestMapping("/api/login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @GetMapping
    public ResponseEntity getAllLogins() {
        return ResponseEntity.ok(loginService.getAllLogins());
    }

    @GetMapping("/{loginId}")
    public ResponseEntity<Login> getLoginById(@PathVariable("loginId") long loginId) {
        Login login = loginService.getLoginById(loginId);

        return (login == null) ?
               ResponseEntity.notFound().build() : ResponseEntity.ok(login);
    }

    @PostMapping
    public ResponseEntity<?> addLogin(@Validated @RequestBody Login login) throws UniqueLoginException {
        return ResponseEntity.ok(loginService.addLogin(login));
    }
}
