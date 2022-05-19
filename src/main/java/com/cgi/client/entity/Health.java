package com.cgi.client.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Health {
    @Id
    @Column(name="CLIENT_ID")
    private Long id;

    @Positive
    @Column(name = "WEIGHT")
    private Double weight;

    @Positive
    @Column(name = "HEIGHT")
    private Double height;

    @Column(name = "LEFT_OR_RIGHT_HANDED")
    private Integer leftOrRightHanded;

    @Column(name = "JOB")
    private String job;

    @Size(max = 2000)
    @Column(name = "JOB_COMMENT")
    private String jobComment;

    @Size(max = 2000)
    @Column(name = "ALLERGIES")
    private String allergies;

    @Size(max = 2000)
    @Column(name = "MEDICATION")
    private String medication;

    @Size(max = 2000)
    @Column(name = "INSULTS")
    private String insults;

    @Size(max = 2000)
    @Column(name = "PREGNANCY")
    private String pregnancy;

    @Column(name = "BLOOD_PRESURE")
    private String bloodPresure;

    @Size(max = 2000)
    @Column(name = "HEREDITY")
    private String heredity;

    @Size(max = 2000)
    @Column(name = "PROBLEMS")
    private String problems;

    @Size(max = 2000)
    @Column(name = "TARGET")
    private String target;

    @Column(name = "HOME_EXERCISE_TIME")
    private Double homeExerciseTime;

    @Size(max = 2000)
    @Column(name = "CURRENT_EXERCISES")
    private String currentExercises;

    @Size(max = 2000)
    @Column(name = "PREVIOUS_SPORTS")
    private String previousSports;

    @OneToOne
    @MapsId
    @JoinColumn(name = "CLIENT_ID")
    private Client client;
}
