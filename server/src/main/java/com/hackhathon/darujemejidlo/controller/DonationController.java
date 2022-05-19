package com.hackhathon.darujemejidlo.controller;


import org.jetbrains.annotations.NotNull;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hackhathon.darujemejidlo.dto.DonationWriteRequestDto;
import com.hackhathon.darujemejidlo.dto.DonationWriteResponseDto;
import com.hackhathon.darujemejidlo.persistence.entity.Donation;
import com.hackhathon.darujemejidlo.service.DonationService;

@RestController
@RequestMapping(path = "/donation",
        produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
public class DonationController {

    private final DonationService donationService;

    public DonationController(DonationService donationService) {
        this.donationService = donationService;
    }


    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<DonationWriteResponseDto> postDonation (@NotNull @RequestBody DonationWriteRequestDto donationWriteRequestDto) {

        return new ResponseEntity<DonationWriteResponseDto>(donationService.createDonation(donationWriteRequestDto), HttpStatus.ACCEPTED);
    }
}
