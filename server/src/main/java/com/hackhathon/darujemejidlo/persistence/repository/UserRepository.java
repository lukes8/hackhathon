package com.hackhathon.darujemejidlo.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hackhathon.darujemejidlo.persistence.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
