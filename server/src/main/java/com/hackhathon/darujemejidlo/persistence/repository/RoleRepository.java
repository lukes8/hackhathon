package com.hackhathon.darujemejidlo.persistence.repository;

import com.hackhathon.darujemejidlo.persistence.entity.Role;
import com.hackhathon.darujemejidlo.persistence.entity.util.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(UserRole name);
}
