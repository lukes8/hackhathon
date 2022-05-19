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
public class HealthCheckBack {
    @Id
    @Column(name = "CLIENT_ID")
    private Long id;

    @Column(name = "SHOULDER_BLADES")
    private String shoulderBlades;

    @Size(max = 2000)
    @Column(name = "SHOULDER_BLADES_COMMENT")
    private String shoulderBladesComment;

    @Column(name = "ARMPIT")
    private String armpit;

    @Size(max = 2000)
    @Column(name = "ARMPIT_COMMENT")
    private String armpitComment;

    @Column(name = "KNEE")
    private String knee;

    @Size(max = 2000)
    @Column(name = "KNEE_COMMENT")
    private String kneeComment;

    @Size(max = 2000)
    @Column(name = "FEET")
    private String feet;

    @Column(name = "HALUX_VALGUS_LEFT_FOOT")
    private String haluxValgusLeftFoot;

    @Column(name = "HALUX_VALGUS_RIGHT_FOOT")
    private String haluxValgusRightFoot;

    @Column(name = "SKOLIOSA_LEFT_RIGHT")
    private String skoliosaLeftRight;

    @Column(name = "SKOLIOSA_RIGHT_LEFT")
    private String skoliosaRightLeft;

    @Column(name = "CALF")
    private String calf;

    @Size(max = 2000)
    @Column(name = "CALF_COMMENT")
    private String calfComment;

    @Column(name = "ACHILLES")
    private String achilles;

    @Size(max = 2000)
    @Column(name = "ACHILLES_COMMENT")
    private String achillesComment;

    @Column(name = "LEFT_HEEL")
    private String leftHeel;

    @Size(max = 2000)
    @Column(name = "LEFT_HEEL_COMMENT")
    private String leftHeelComment;

    @Column(name = "RIGHT_HEEL")
    private String rightHeel;

    @Size(max = 2000)
    @Column(name = "RIGHT_HEEL_COMMENT")
    private String rightHeelComment;

    @OneToOne
    @MapsId
    @JoinColumn(name = "CLIENT_ID")
    private Client client;
}


