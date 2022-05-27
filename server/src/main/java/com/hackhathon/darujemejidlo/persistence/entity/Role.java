package com.hackhathon.darujemejidlo.persistence.entity;

import com.hackhathon.darujemejidlo.persistence.entity.util.UserRole;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "ROLE")
@Data
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private Integer id;

    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private UserRole name;

    public Role(UserRole name) {
        this.name = name;
    }
}