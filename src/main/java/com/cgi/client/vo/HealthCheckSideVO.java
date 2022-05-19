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
public class HealthCheckSideVO {
    private Long id;

    private String belly;

    private String bellyComment;

    private String mm;

    private String mmComment;

    private String lordosaCp;

    private String lordosaCPComment;

    private String kyfosaThp;

    private String kyfosaThpComment;

    private String lordosaLp;

    private String lordosaLpComment;

    private String kneeHypertension;

    private String kneeHypertensionComment;

    private String calf;

    private String calfComment;

    private String flatFootCross;

    private String flatFootCrossComment;

    private String flatFootLengthwise;

    private String flatFootLengthwiseComment;

    @JsonBackReference
    private ClientVO client;
}
