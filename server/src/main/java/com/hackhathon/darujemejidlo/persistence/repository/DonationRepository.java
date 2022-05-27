package com.hackhathon.darujemejidlo.persistence.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.hackhathon.darujemejidlo.persistence.entity.Donation;

public interface DonationRepository extends JpaRepository<Donation, Long> {

}