package com.cgi.client.rest;

import com.cgi.client.service.ClientService;
import com.cgi.client.service.ClientVisitService;
import com.cgi.client.vo.ClientVO;
import com.cgi.client.vo.ClientVisitVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
public class ClientController {
    @Autowired
    private ClientService clientService;

    @Autowired
    private ClientVisitService clientVisitService;

    @GetMapping(value = "/clients")
    List<ClientVO> getAll() {
        return clientService.getAll();
    }

    @GetMapping("/client/{id}")
    ClientVO getClient(@PathVariable Long id) {
        return clientService.get(id);
    }

    @PostMapping(value = "/client")
    ClientVO createClient(@RequestBody ClientVO client) {
        return clientService.create(client);
    }

    @PutMapping(value = "/client/{id}")
    ClientVO updateClient(@PathVariable Long id, @RequestBody ClientVO client) {
        return clientService.update(id, client);
    }

    @DeleteMapping("/client/{id}")
    void deleteClient(@PathVariable Long id) {
        clientService.delete(id);
    }

    @GetMapping(value = "/clientvisits")
    List<ClientVisitVO> getVisits(@RequestParam Long id) {
        return clientVisitService.getAll(id);
    }

    @GetMapping("/clientvisit/{id}")
    ClientVisitVO getClientVisit(@PathVariable Long id) {
        return clientVisitService.get(id);
    }

    @PostMapping(value = "/clientvisit")
    ClientVisitVO createClientVisit(@RequestBody ClientVisitVO clientVisit) {
        return clientVisitService.create(clientVisit);
    }

    @PutMapping(value = "/clientvisit/{id}")
    ClientVisitVO updateClientVisit(@PathVariable Long id, @RequestBody ClientVisitVO clientVisit) {
        return clientVisitService.update(id, clientVisit);
    }

    @DeleteMapping("/clientvisit/{id}")
    void deleteClientVisit(@PathVariable Long id) {
        clientVisitService.delete(id);
    }

}
