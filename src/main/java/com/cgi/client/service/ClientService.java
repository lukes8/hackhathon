package com.cgi.client.service;


import com.cgi.client.entity.Client;
import com.cgi.client.repository.*;
import com.cgi.client.vo.ClientVO;
import org.hibernate.ObjectNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public
class ClientService {
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private HealthRepository healthRepository;
    @Autowired
    private HealthCheckActivityRepository healthCheckActivityRepository;
    @Autowired
    private HealthCheckBackRepository healthCheckBackRepository;
    @Autowired
    private HealthCheckFrontRepository healthCheckFrontRepository;
    @Autowired
    private HealthCheckSideRepository healthCheckSideRepository;
    @Autowired
    private ModelMapper modelMapper;

    public ClientService() {
    }

    @Transactional(readOnly = true)
    public List<ClientVO> getAll() {
        return clientRepository.findAll().stream().map(item -> modelMapper.map(item, ClientVO.class)).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public ClientVO get(Long id) {
        Client client = clientRepository.findById(id).orElse(null);
        if (client == null)
            return null;
        return modelMapper.map(client, ClientVO.class);
    }

    public ClientVO create(@NotNull @Valid ClientVO client) {
        Client clientEntity = clientRepository.save(modelMapper.map(client, Client.class));
        return modelMapper.map(clientEntity, ClientVO.class);
    }

    public ClientVO update(Long id, @NotNull @Valid ClientVO client) {
        if (!clientRepository.existsById(id)) {
            throw new ObjectNotFoundException(id, Client.class.getSimpleName());
        }
        Client clientEntity =  clientRepository.save(modelMapper.map(client, Client.class));
        return modelMapper.map(clientEntity, ClientVO.class);
    }

    public void delete(Long id) {
        if (!clientRepository.existsById(id)) {
            throw new ObjectNotFoundException(id, Client.class.getSimpleName());
        }
        clientRepository.deleteById(id);
    }

    @Transactional(readOnly = true)
    public List<String> getAllEmailAdresses() {
        return clientRepository.findAll().stream().map(item -> modelMapper.map(item.getEmail(), String.class)).collect(Collectors.toList());
    }
}
