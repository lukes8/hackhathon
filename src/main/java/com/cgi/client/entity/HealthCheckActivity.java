package com.cgi.client.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class HealthCheckActivity {
    @Id
    @Column(name="CLIENT_ID")
    private Long id;

    @Size(max = 2000)
    @Column(name = "WALK")
    private String walk;

    @Size(max = 2000)
    @Column(name = "PUSHUP")
    private String pushUp;

    @Size(max = 2000)
    @Column(name = "ROLLING")
    private String rolling;

    @Size(max = 2000)
    @Column(name = "EXTENSIVENESS_OF_HIP_JOINT")
    private String extensivenessOfHipJoint;

    @Size(max = 2000)
    @Column(name = "ABDUCTION_OF_HIP_JOINT")
    private String abductionOfHipJoint;

    @Size(max = 2000)
    @Column(name = "ABDUCTION_OF_SHOULDER_JOINT")
    private String abductionOfShoulderJoint;

    @Size(max = 2000)
    @Column(name = "FORWARD_BEND")
    private String forwardBend;

    @Size(max = 2000)
    @Column(name = "SIDE_BEND")
    private String sideBend;

    @Size(max = 2000)
    @Column(name = "MOBILITY_OF_HIP_JOINT")
    private String mobilityofHipJoint;

    @Size(max = 2000)
    @Column(name = "MOBILITY_OF_KNEE_JOINT")
    private String mobilityofKneeJoint;

    @Size(max = 2000)
    @Column(name = "MOBILITY_OF_HOCK_JOINT")
    private String mobilityofHockJoint;

    @Size(max = 2000)
    @Column(name = "MOBILITY_OF_SHOULDER_JOINT")
    private String mobilityofShoulderJoint;

    @Size(max = 2000)
    @Column(name = "MOBILITY_OF_ELBOW_JOINT")
    private String mobilityofElbowJoint;

    @Size(max = 2000)
    @Column(name = "MOBILITY_OF_WRIST")
    private String mobilityofWrist;

    @Column(name = "MOBILITY_OF_BACK")
    private String mobilityofBack;

    @Column(name = "HYPERMOBILITY")
    private String hypermobility;

    @Size(max = 2000)
    @Column(name = "PHYSICAL_ENDURANCE")
    private String physicalEndurance;

    @OneToOne
    @MapsId
    @JoinColumn(name = "CLIENT_ID")
    private Client client;
}
