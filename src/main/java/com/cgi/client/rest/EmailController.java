package com.cgi.client.rest;

import com.cgi.client.service.EmailService;
import com.cgi.client.vo.EmailRequestVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class EmailController {
    @Autowired
    private EmailService emailService;

    @GetMapping(value = "/email-addresses", produces = MediaType.APPLICATION_JSON_VALUE)
    String getEmailAddresses() throws IOException {
        return emailService.getEmailAdresses();
    }

    @PostMapping(value = "/send-email")
    void sendEmail(@RequestBody EmailRequestVO emailRequest) throws IOException {
        emailService.sendEmail(emailRequest);
    }
}
