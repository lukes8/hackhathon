package com.hackhathon.darujemejidlo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hackhathon.darujemejidlo.exception.EmailNotValidException;
import com.hackhathon.darujemejidlo.persistence.entity.Login;
import com.hackhathon.darujemejidlo.persistence.repository.LoginRepository;


@Service
@Transactional
public class LoginService {

    @Autowired
    private LoginRepository loginRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public List<Login> getAllLogins() {

        return loginRepository.findAll();
    }

    public Login getLoginById(long id) {

        Optional<Login> login = loginRepository.findById(id);
        return (login.isEmpty()) ? null : login.get();
    }

    /* ToDo validate login, new type of exception  */
    public Login addLogin(Login login) {

        if(login.getEmail().equals("not")) {
            throw new EmailNotValidException(login.getEmail());
        }
        login.setPasswordHash(passwordEncoder.encode(login.getPasswordHash()));
        return loginRepository.save(login);
    }
}
