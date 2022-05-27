package com.hackhathon.darujemejidlo.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hackhathon.darujemejidlo.persistence.entity.Login;

public interface LoginRepository extends JpaRepository<Login, Long> {


}
