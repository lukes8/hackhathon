package com.hackhathon.darujemejidlo.persistence.entity;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.Data;

@Entity
@Table(name = "LOGIN")
@Data
public class Login {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "login_id", precision = 10)
    private Long id;

    @Column(name = "email", length = 255, nullable = false, unique = true)
    private String email;

    @JsonProperty(access = Access.WRITE_ONLY)
    private String passwordHash;

    @JsonBackReference
    @OneToOne(optional = false)
    @JoinColumn(name = "user_id", referencedColumnName = "user_id", unique = true, nullable = false)
    private User user;
}