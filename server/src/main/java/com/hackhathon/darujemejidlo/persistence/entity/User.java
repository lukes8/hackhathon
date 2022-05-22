package com.hackhathon.darujemejidlo.persistence.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import io.swagger.annotations.ApiImplicitParam;
import lombok.Data;

@Entity
@Table(name = "USER")
@Data
public class User implements Serializable {

    @Id
    @Column(name = "user_id")
    private Long id;

    @OneToOne
    @MapsId
    @JsonBackReference
    private Login login;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(	name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles = new HashSet<>();

    @Column(name = "first_name", length = 50, nullable = false)
    private String firstName;

    @Column(name = "last_name", length = 50, nullable = false)
    private String lastName;

    @Column(name = "phone_number", nullable = false, unique = true)
    private String phoneNumber;

    @ManyToMany(mappedBy = "requestedByUser")
    private List<Donation> requestedDonations;
/*
    @JsonManagedReference
    @OneToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE} )
    @JoinColumn(name = "login_id", referencedColumnName = "user_id")
    private Login login;*/
}
