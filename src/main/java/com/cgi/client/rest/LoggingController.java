package com.cgi.client.rest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LoggingController {
    @PostMapping(value = "/log")
    void createClient(@RequestBody String message) {
        log.info(message);
    }
}
