package com.hackhathon.darujemejidlo.persistence.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "USER")
@Data
public class User implements Serializable {

    @Id
    private Long id;

    @OneToOne
    @PrimaryKeyJoinColumn
    private Login login;

    @Column(name = "first_name", length = 50, nullable = false)
    private String firstName;

    @Column(name = "last_name", length = 50, nullable = false)
    private String lastName;

    @Column(name = "phone_number", length = 255, nullable = false, unique = true)
    private String phoneNumber;

    @ManyToMany(mappedBy = "requestedByUser")
    private List<Donation> requestedDonations;
}
