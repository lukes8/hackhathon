package com.cgi.client.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ClientVisit {
    @Positive
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "DATE")
    private Date date;

    @Column(name = "TYPE")
    private String type;

    @Size(max = 2000)
    @Column(name = "COMMENT")
    private String comment;

    @NotNull
    @Column(name = "CLIENT_ID")
    private Long clientId;

    @Size(max = 2000)
    @Column(name = "U_PROPERTY9")
    private String upperBellyProperty9;

    @Size(max = 2000)
    @Column(name = "U_PROPERTY8")
    private String upperBellyProperty8;

    @Size(max = 2000)
    @Column(name = "U_PROPERTY7")
    private String upperBellyProperty7;

    @Size(max = 2000)
    @Column(name = "U_PROPERTY6")
    private String upperBellyProperty6;

    @Size(max = 2000)
    @Column(name = "U_PROPERTY5")
    private String upperBellyProperty5;

    @Size(max = 2000)
    @Column(name = "U_PROPERTY4")
    private String upperBellyProperty4;

    @Size(max = 2000)
    @Column(name = "U_PROPERTY3")
    private String upperBellyProperty3;

    @Size(max = 2000)
    @Column(name = "U_PROPERTY2")
    private String upperBellyProperty2;

    @Size(max = 2000)
    @Column(name = "U_PROPERTY1")
    private String upperBellyProperty1;

    @Size(max = 2000)
    @Column(name = "BELLY_BUTTON")
    private String bellyButton;

    @Size(max = 2000)
    @Column(name = "L_PROPERTY8")
    private String lowerBellyProperty8;

    @Size(max = 2000)
    @Column(name = "L_PROPERTY7")
    private String lowerBellyProperty7;

    @Size(max = 2000)
    @Column(name = "L_PROPERTY6")
    private String lowerBellyProperty6;

    @Size(max = 2000)
    @Column(name = "L_PROPERTY5")
    private String lowerBellyProperty5;

    @Size(max = 2000)
    @Column(name = "L_PROPERTY4")
    private String lowerBellyProperty4;

    @Size(max = 2000)
    @Column(name = "L_PROPERTY3")
    private String lowerBellyProperty3;

    @Size(max = 2000)
    @Column(name = "L_PROPERTY2")
    private String lowerBellyProperty2;

    @Size(max = 2000)
    @Column(name = "L_PROPERTY1")
    private String lowerBellyProperty1;

    @Column(name = "IMAGE1")
    private String image1;

    @Column(name = "IMAGE2")
    private String image2;

    @Column(name = "IMAGE3")
    private String image3;
}
