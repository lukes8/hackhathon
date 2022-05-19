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
public class HealthCheckActivityVO {
    private Long id;

    private String walk;

    private String pushUp;

    private String rolling;

    private String extensivenessOfHipJoint;

    private String abductionOfHipJoint;

    private String abductionOfShoulderJoint;

    private String forwardBend;

    private String sideBend;

    private String mobilityofHipJoint;

    private String mobilityofKneeJoint;

    private String mobilityofHockJoint;

    private String mobilityofShoulderJoint;

    private String mobilityofElbowJoint;

    private String mobilityofWrist;

    private String mobilityofBack;

    private String hypermobility;

    private String physicalEndurance;

    @JsonBackReference
    private ClientVO client;
}
