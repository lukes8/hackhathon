package com.hackhathon.darujemejidlo.persistence.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.Data;

@Entity
@Table(name = "LOGIN")
@Data
public class Login implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "login_id", precision = 10)
    private Long id;

    @Column(name = "email", length = 255, nullable = false, unique = true)
    private String email;

    @JsonProperty(access = Access.WRITE_ONLY)
    private String passwordHash;

    @OneToOne(optional = false)
    private User user;
}