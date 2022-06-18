package com.hackhathon.darujemejidlo.service;

import com.hackhathon.darujemejidlo.persistence.entity.User;
import com.hackhathon.darujemejidlo.persistence.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(long id) {
        Optional<User> user = userRepository.findById(id);

        return (user.isEmpty()) ? null : user.get();
    }

    public User addUser(User user) {
        userRepository.save(user);

        return user;
    }
}
