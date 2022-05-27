package com.hackhathon.darujemejidlo.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.hackhathon.darujemejidlo.dto.DonationWriteRequestDto;
import com.hackhathon.darujemejidlo.persistence.entity.Donation;
import com.hackhathon.darujemejidlo.persistence.entity.User;
import com.hackhathon.darujemejidlo.persistence.repository.DonationRepository;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DonationService {

    @NonNull
    DonationRepository donationRepository;


    @Transactional
    public void deleteDonation(Long donationId) {
        donationRepository.deleteById(donationId);
    }
  
    @Transactional
    public Optional<Donation> updateDonation(DonationWriteRequestDto donationWriteRequestDto) {
        return donationRepository.findById(donationWriteRequestDto.getId())
                .map(donation -> {
                    donation.setName(donationWriteRequestDto.getName());
                    donation.setFoodCategory(donationWriteRequestDto.getFoodCategory());
                    donation.setAfterExpiration(donationWriteRequestDto.getAfterExpiration());
                    donation.setDonationLocation(donationWriteRequestDto.getDonationLocation());
                    donation.setDateInserted(donationWriteRequestDto.getDateInserted());
                    donation.setReservationPossible(donationWriteRequestDto.getReservationPossible());
                    return donationRepository.save(donation);
                });
    }
  
    @Transactional
    public Donation createDonation(DonationWriteRequestDto donationWriteRequestDto) {
        Donation donation = new Donation();
        donation.setName(donationWriteRequestDto.getName());
        donation.setFoodCategory(donationWriteRequestDto.getFoodCategory());
        donation.setAfterExpiration(donationWriteRequestDto.getAfterExpiration());
        donation.setDonationLocation(donationWriteRequestDto.getDonationLocation());
        donation.setDateInserted(donationWriteRequestDto.getDateInserted());
        donation.setReservationPossible(donationWriteRequestDto.getReservationPossible());
        return donationRepository.save(donation);
    }

    public Donation getDonation(Long donationId) {
        return donationRepository.findById(donationId).orElseThrow(() -> new EntityNotFoundException(String.format("Entity %s with id %d not found.", Donation.class, donationId)));
    }


    public Donation likeDonation(Long donationId) {

        if (donationId != 0L) {
            Donation donation = donationRepository.findById(donationId)
                    .orElseThrow(() -> new EntityNotFoundException("Not found Donation with id = " + donationId));
            //todo get user based on jwt token
            //donation.getRequestedByUser().add();
            donationRepository.save(donation);
            return donation;
        }
        return null;
    }


    public Donation unlikeDonation(Long donationId) {
        if (donationId != 0L) {
            Donation donation = donationRepository.findById(donationId)
                    .orElseThrow(() -> new EntityNotFoundException("Not found Donation with id = " + donationId));
            //todo get user based on jwt token
            //donation.getRequestedByUser().remove();
            donationRepository.save(donation);
            return donation;
        }
        return null;
    }

    public List<Donation> getAllDonation() {
        return donationRepository.findAll();
    }
}
