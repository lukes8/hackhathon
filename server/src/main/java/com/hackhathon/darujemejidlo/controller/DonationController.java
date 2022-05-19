package com.hackhathon.darujemejidlo.controller;


import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.jetbrains.annotations.NotNull;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hackhathon.darujemejidlo.dto.DonationWriteRequestDto;
import com.hackhathon.darujemejidlo.persistence.entity.Donation;
import com.hackhathon.darujemejidlo.service.DonationService;

import io.swagger.v3.oas.annotations.Parameter;

@RestController
@RequestMapping(path = "/donation",
        produces = MediaType.APPLICATION_JSON_VALUE)
public class DonationController {

    private final DonationService donationService;

    public DonationController(DonationService donationService) {
        this.donationService = donationService;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.ALL_VALUE)
    public ResponseEntity<List<Donation>> getAllDonation () {

        return new ResponseEntity<>(donationService.getAllDonation(), HttpStatus.OK);
    }

    @GetMapping(path="/{donationId}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.ALL_VALUE)
    public ResponseEntity<Donation> getDonation (@Parameter(description = "The id of the requested donation.")
    @PathVariable("donationId") final Long donationId) {

        return new ResponseEntity<>(donationService.getDonation(donationId), HttpStatus.OK);
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Donation> postDonation (@NotNull @RequestBody DonationWriteRequestDto donationWriteRequestDto) {

        return new ResponseEntity<>(donationService.createDonation(donationWriteRequestDto), HttpStatus.CREATED);
    }

    @PutMapping(path="/{donationId}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Donation> putDonation (@NotNull @RequestBody DonationWriteRequestDto donationWriteRequestDto) {
        if(donationWriteRequestDto.getId() == null) {
            throw new Error(String.valueOf(HttpStatus.NOT_MODIFIED));

        }
        return new ResponseEntity<>(donationService.updateDonation(donationWriteRequestDto).orElseThrow(() -> new Error("test")), HttpStatus.OK);
    }

    @DeleteMapping(path="/{donationId}", consumes = MediaType.ALL_VALUE)
    public ResponseEntity<Donation> deleteDonation (@Parameter(description = "The id of the donation to be deleted.")
    @PathVariable("donationId") final Long donationId) {
        donationService.deleteDonation(donationId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
