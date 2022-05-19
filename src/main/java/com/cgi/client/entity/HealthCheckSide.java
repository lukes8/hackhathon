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
public class HealthCheckSide {
    @Id
    @Column(name = "CLIENT_ID")
    private Long id;

    @Column(name = "BELLY")
    private String belly;

    @Size(max = 2000)
    @Column(name = "BELLY_COMMENT")
    private String bellyComment;

    @Column(name = "MM")
    private String mm;

    @Size(max = 2000)
    @Column(name = "MM_COMMENT")
    private String mmComment;

    @Column(name = "LORDOSA_CP")
    private String lordosaCp;

    @Size(max = 2000)
    @Column(name = "LORDOSA_CP_COMMENT")
    private String lordosaCPComment;

    @Column(name = "KYFOSA_THP")
    private String kyfosaThp;

    @Size(max = 2000)
    @Column(name = "KYFOSA_THP_COMMENT")
    private String kyfosaThpComment;

    @Column(name = "LORDOSA_LP")
    private String lordosaLp;

    @Size(max = 2000)
    @Column(name = "LORDOSA_LP_COMMENT")
    private String lordosaLpComment;

    @Column(name = "KNEE_HYPERTENSION")
    private String kneeHypertension;

    @Size(max = 2000)
    @Column(name = "KNEE_HYPERTENSION_COMMENT")
    private String kneeHypertensionComment;

    @Column(name = "CALF")
    private String calf;

    @Size(max = 2000)
    @Column(name = "CALF_COMMENT")
    private String calfComment;

    @Column(name = "FLAT_FOOT_CROSS")
    private String flatFootCross;

    @Size(max = 2000)
    @Column(name = "FLAT_FOOT_CROSS_COMMENT")
    private String flatFootCrossComment;

    @Column(name = "FLAT_FOOT_LENGTHWISE")
    private String flatFootLengthwise;

    @Size(max = 2000)
    @Column(name = "FLAT_FOOT_LENGTHWISE_COMMENT")
    private String flatFootLengthwiseComment;

    @OneToOne
    @MapsId
    @JoinColumn(name = "CLIENT_ID")
    private Client client;
}
