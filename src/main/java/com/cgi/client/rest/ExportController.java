package com.cgi.client.rest;

import com.cgi.client.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class ExportController {
    @Autowired
    private EmailService emailService;

    @PostMapping(value = "/export")
    void export() throws IOException {
        emailService.export();
    }
}
