package com.cgi.client.vo;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HealthVO {
    private Long id;

    private Double weight;

    private Double height;

    private Boolean leftOrRightHanded;

    private String job;

    private String jobComment;

    private String allergies;

    private String medication;

    private String insults;

    private String pregnancy;

    private String bloodPresure;

    private String heredity;

    private String problems;

    private String target;

    private Double homeExerciseTime;

    private String currentExercises;

    private String previousSports;

    @JsonBackReference
    private ClientVO client;
}
