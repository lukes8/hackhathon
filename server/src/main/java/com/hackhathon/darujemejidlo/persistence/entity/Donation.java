package com.hackhathon.darujemejidlo.persistence.entity;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.hackhathon.darujemejidlo.persistence.entity.util.FoodCategory;

import lombok.Data;

@Entity
@Table(name = "DONATION")
@Data
public class Donation {

    @Id
    @Column(name = "donation_id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "after_expiration", nullable = false)
    private Boolean afterExpiration;

    @Column(name = "food_category", nullable = false)
    @Enumerated(EnumType.STRING)
    private FoodCategory foodCategory;

    @Column(name = "donation_location", nullable = false)
    private String donationLocation;

    @Column(name = "reservation_possible", nullable = false)
    private Boolean reservationPossible;

    @Column(name = "date_inserted", nullable = false)
    private LocalDateTime dateInserted;

    @ManyToMany
    @JoinTable(
            name = "DONATION_USER",
            joinColumns = @JoinColumn(name = "donation_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id"))
    private List<User> requestedByUser;
}
