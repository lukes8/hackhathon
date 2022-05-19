package com.hackhathon.darujemejidlo.dto;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.hackhathon.darujemejidlo.persistence.entity.util.FoodCategory;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Schema(description = "Represents the request payload which is used to write a donation.")
@Data
@JsonInclude(Include.NON_NULL)
public class DonationWriteRequestDto {

    @JsonProperty("id")
    private Long id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("afterExpiration")
    private Boolean afterExpiration;

    @JsonProperty("foodCategory")
    private FoodCategory foodCategory;

    @JsonProperty("donationLocation")
    private String donationLocation;

    @JsonProperty("reservationPossible")
    private Boolean reservationPossible;

    @JsonProperty("dateInserted")
    private LocalDateTime dateInserted;

}
