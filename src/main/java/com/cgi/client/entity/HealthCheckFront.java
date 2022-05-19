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
public class HealthCheckFront {
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

    @OneToOne
    @MapsId
    @JoinColumn(name = "CLIENT_ID")
    private Client client;
}
