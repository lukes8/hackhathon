package com.cgi.client.rest;

import com.cgi.client.service.FutureClientService;
import com.cgi.client.vo.ClientVO;
import com.cgi.client.vo.FutureClientVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FutureClientController {
    @Autowired
    private FutureClientService futureClientService;

    @GetMapping(value = "/futureclients")
    List<FutureClientVO> getAll() {
        return futureClientService.getAll();
    }

    @PostMapping(value = "/futureclient")
    FutureClientVO createClient(@RequestBody FutureClientVO client) {
        return futureClientService.create(client);
    }

    @DeleteMapping("/futureclient/{id}")
    void deleteClient(@PathVariable Long id) {
        futureClientService.delete(id);
    }

}
