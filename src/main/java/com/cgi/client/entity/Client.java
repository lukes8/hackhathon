package com.cgi.client.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
public class Client {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(max = 256)
    @Column(name = "FIRSTNAME")
    private String firstName;

    @NotNull
    @Size(max = 256)
    @Column(name = "LASTNAME")
    private String lastName;

    @Column(name = "BIRTHDATE")
    private Date birthDate;

    @Size(max = 2000)
    @Column(name = "ADDRESS")
    private String address;

    @NotNull
    @Size(max = 50)
    private String phone;

    @NotNull
    @Email
    @Size(max = 256)
    private String email;

    @OneToOne(mappedBy = "client",cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Health health;

    @OneToOne(mappedBy = "client",cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private HealthCheckActivity healthCheckActivity;

    @OneToOne(mappedBy = "client",cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private HealthCheckBack healthCheckBack;

    @OneToOne(mappedBy = "client",cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private HealthCheckFront healthCheckFront;

    @OneToOne(mappedBy = "client",cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private HealthCheckSide healthCheckSide;
}
