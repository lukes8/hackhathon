package com.cgi.client.vo;

import com.cgi.client.entity.HealthCheckActivity;
import com.cgi.client.entity.HealthCheckBack;
import com.cgi.client.entity.HealthCheckFront;
import com.cgi.client.entity.HealthCheckSide;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ClientVO {
    private Long id;

    private String firstName;

    private String lastName;

    private Date birthDate;

    private String address;

    private String phone;

    private String email;

    @JsonManagedReference
    private HealthVO health;

    @JsonManagedReference
    private HealthCheckActivityVO healthCheckActivity;

    @JsonManagedReference
    private HealthCheckBackVO healthCheckBack;

    @JsonManagedReference
    private HealthCheckFrontVO healthCheckFront;

    @JsonManagedReference
    private HealthCheckSideVO healthCheckSide;
}
